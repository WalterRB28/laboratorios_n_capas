package com.ncapas.laboratorio_uno_n_capas.Common;

import com.ncapas.laboratorio_uno_n_capas.domain.model.Pokemon;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class PokemonList {
    private final List<Pokemon> pokemon;

    public PokemonList() {
        this.pokemon = new ArrayList<>();

        this.pokemon.add(Pokemon.builder()
                .id(1L)
                .nombre("Pikachu")
                .tipo("Electrico")
                .encontradoEn("Bosque")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(2L)
                .nombre("Charmander")
                .tipo("Fuego")
                .encontradoEn("Montaña")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(3L)
                .nombre("Squirtle")
                .tipo("Agua")
                .encontradoEn("Lago")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(4L)
                .nombre("Bulbasaur")
                .tipo("Planta")
                .encontradoEn("Bosque")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(5L)
                .nombre("Geodude")
                .tipo("Roca")
                .encontradoEn("Cueva")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(6L)
                .nombre("Onix")
                .tipo("Roca")
                .encontradoEn("Cueva")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(7L)
                .nombre("Pidgey")
                .tipo("Volador")
                .encontradoEn("Pradera")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(8L)
                .nombre("Oddish")
                .tipo("Planta")
                .encontradoEn("Bosque")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(9L)
                .nombre("Magikarp")
                .tipo("Agua")
                .encontradoEn("Río")
                .region("Kanto").build());

        this.pokemon.add(Pokemon.builder()
                .id(10L)
                .nombre("Growlithe")
                .tipo("Fuego")
                .encontradoEn("Pradera")
                .region("Kanto").build());
    }
}