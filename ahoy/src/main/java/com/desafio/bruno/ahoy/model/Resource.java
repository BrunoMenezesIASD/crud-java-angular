package com.desafio.bruno.ahoy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString()
@Entity
@Table(name = "resource")
public class Resource {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    public Declaration _declaration;

    @Embedded
    public Agentes agentes;

    @Column(name = "nome")
    public String nome;

    @Column(name = "extensao")
    public String extensao;
}
