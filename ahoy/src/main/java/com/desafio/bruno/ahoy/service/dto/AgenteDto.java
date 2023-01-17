package com.desafio.bruno.ahoy.service.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString()
public class AgenteDto {

    private Long id;

    private CodigoDto codigo;

    private DataDto data;

    private List<RegiaoDto> regiao;
}
