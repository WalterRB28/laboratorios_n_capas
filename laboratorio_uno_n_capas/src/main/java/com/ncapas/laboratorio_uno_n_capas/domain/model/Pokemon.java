package com.ncapas.laboratorio_uno_n_capas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon {
    private Long id;
    private String nombre;
    private String tipo;
    private String encontradoEn;
    private String region;
}
