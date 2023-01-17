package com.desafio.bruno.ahoy.model;

import lombok.*;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString()
@Data
@Entity
public class Agentes implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "agentes_generator")
    @SequenceGenerator(name = "agentes_generator", sequenceName = "agentes_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToOne
    private Attributes attributes;

    @OneToOne
    private Agente agente;
}
