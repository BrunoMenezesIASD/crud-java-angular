package com.desafio.bruno.ahoy.service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString()
public class PrecoMedioDto {
    public ArrayList<ValorDto> valor;
}
