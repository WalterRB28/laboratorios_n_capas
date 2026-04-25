package com.ncapas.laboratorio_uno_n_capas;

import com.ncapas.laboratorio_uno_n_capas.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LaboratorioUnoNCapasApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaboratorioUnoNCapasApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonService pokemonService) {

        return args -> {

            System.out.println("=== POKEDEX APP ===");

            System.out.println("\n--- Pokémon tipo Fuego ---");
            pokemonService.typeFilter("Fuego")
                    .forEach(p -> System.out.println(pokemonService.formatearPokemon(p)));

            System.out.println("\n--- Pokémon en Bosque ---");
            pokemonService.zoneFilter("Bosque")
                    .forEach(p -> System.out.println(pokemonService.formatearPokemon(p)));

            System.out.println("\n--- Débiles contra Agua ---");
            pokemonService.debilityFilter("Agua")
                    .forEach(p -> System.out.println(pokemonService.formatearPokemon(p)));
        };
    }
}
