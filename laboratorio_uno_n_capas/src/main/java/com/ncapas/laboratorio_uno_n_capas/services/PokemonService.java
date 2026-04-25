package com.ncapas.laboratorio_uno_n_capas.services;

import com.ncapas.laboratorio_uno_n_capas.domain.model.Pokemon;
import com.ncapas.laboratorio_uno_n_capas.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonService {
    private final ProductRepository pokemonRepository;

    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    public List<Pokemon> typeFilter(String tipo) {
        return pokemonRepository.findAll()
                .stream()
                .filter(pokemon -> pokemon.getTipo().equalsIgnoreCase(tipo))
                .toList();
    }

    public List<Pokemon> zoneFilter(String zona) {
        return pokemonRepository.findAll()
                .stream()
                .filter(pokemon -> pokemon.getEncontradoEn().equalsIgnoreCase(zona))
                .toList();
    }

    public List<Pokemon> debilityFilter(String debilidad) {
        return pokemonRepository.findAll()
                .stream()
                .filter(pokemon -> getDebilities(pokemon.getTipo())
                        .stream()
                        .anyMatch(d -> d.equalsIgnoreCase(debilidad))).toList();
    }

    private List<String> getDebilities(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "electrico" -> List.of("Tierra");
            case "agua" -> List.of("Planta", "Electrico");
            case "fuego" -> List.of("Agua", "Roca", "Tierra");
            case "planta" -> List.of("Fuego", "Hielo");
            default -> List.of("Desconocida");
        };
    }

    public String formatearPokemon(Pokemon pokemon) {
        String debilidades = String.join(", ", getDebilities(pokemon.getTipo()));

        return "[PKMN] Nombre: " + pokemon.getNombre()
                + " | Tipo: " + pokemon.getTipo()
                + " | Debilidades: " + debilidades;
    }
}