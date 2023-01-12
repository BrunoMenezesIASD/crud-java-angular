package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
public class DeclarationDto {

    private Long id;

    public AttributesDto _attributes;
}
