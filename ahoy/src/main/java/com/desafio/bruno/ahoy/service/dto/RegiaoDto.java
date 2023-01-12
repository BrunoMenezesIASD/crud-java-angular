package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
public class RegiaoDto {

    private Long id;

    public AttributesDto _attributes;

    public GeracaoDto geracao;

    public CompraDto compra;

    public PrecoMedioDto precoMedio;
}
