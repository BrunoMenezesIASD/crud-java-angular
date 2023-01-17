package com.desafio.bruno.ahoy.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString()
@Entity
public class Codigo {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "codigo_generator")
    @SequenceGenerator(name = "codigo_generator", sequenceName = "codigo_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    private String text;

    @OneToOne
    private Agente agente;
}
