package com.desafio.bruno.ahoy.service.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString()
public class AgenteDto {

    public CodigoDto codigo;

    public DataDto data;

    public List<RegiaoDto> regiao;
}
