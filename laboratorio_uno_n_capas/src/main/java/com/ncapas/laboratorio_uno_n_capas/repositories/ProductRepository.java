package com.ncapas.laboratorio_uno_n_capas.repositories;

import com.ncapas.laboratorio_uno_n_capas.Common.PokemonList;
import com.ncapas.laboratorio_uno_n_capas.domain.model.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final PokemonList pokemonList;

    public List<Pokemon> findAll() {
        return pokemonList.getPokemon();
    }
}