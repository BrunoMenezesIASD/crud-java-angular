package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
public class AttributesDto {

    private Long id;

    public String version;

    public String encoding;

    public String versao;

    public String sigla;
}
