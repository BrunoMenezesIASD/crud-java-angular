package com.desafio.bruno.ahoy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.List;

@Getter
@Setter
@ToString()
@Embeddable
@lombok.Data
public class Agente{

    @Embedded
    public Codigo codigo;

    @Embedded
    public Data data;


    public List<Regiao> regiao;
}
