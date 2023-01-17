package com.desafio.bruno.ahoy.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString()
@Entity
public class Attributes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "attributes_generator")
    @SequenceGenerator(name = "attributes_generator", sequenceName = "attributes_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    public String version;

    public String encoding;

    public String versao;

    public String sigla;

    @OneToOne
    private Declaration declaration;

    @OneToOne
    private Agente agente;

    @OneToOne
    private Regiao regiao;



}
