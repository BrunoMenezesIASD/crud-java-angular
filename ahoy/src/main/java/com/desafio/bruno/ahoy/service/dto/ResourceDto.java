package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
public class ResourceDto {

    private Long id;

    public DeclarationDto _declaration;

    public AgentesDto agentes;

    public String nome;

    public String extensao;
}
