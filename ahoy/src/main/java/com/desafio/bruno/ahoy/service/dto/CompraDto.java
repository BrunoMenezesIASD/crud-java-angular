package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString()
public class CompraDto {

    private Long id;

    private List<ValorDto> valor;
}
