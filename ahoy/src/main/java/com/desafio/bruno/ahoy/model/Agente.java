package com.desafio.bruno.ahoy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString()
@Embeddable
public class Agente{

    @Embedded
    public Codigo codigo;

    @Embedded
    public Data data;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "agente_id", insertable = false, updatable = false)
    public List<Regiao> regiao;
}
