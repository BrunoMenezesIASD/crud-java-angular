package com.desafio.bruno.ahoy.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString()
@Entity
@Table(name = "resource")
public class Resources implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "resources_generator")
    @SequenceGenerator(name = "resources_generator", sequenceName = "resources_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToOne
    public Declaration declaration;

    @OneToOne
    public Agentes agentes;

    @Column(name = "nome")
    public String nome;

    @Column(name = "extensao")
    public String extensao;
}
