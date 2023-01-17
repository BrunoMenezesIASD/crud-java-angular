package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
public class ResourceDto {

    private Long id;

    private AgentesDto agentes;

    private String extensao;

    private String nome;

    private DeclarationDto _declaration;


}
