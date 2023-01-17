package com.desafio.bruno.ahoy.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString()
@Entity
public class Data {


    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "data_generator")
    @SequenceGenerator(name = "data_generator", sequenceName = "data_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Embedded
    @Temporal(TemporalType.TIMESTAMP)
    private Date text;

    @OneToOne
    private Agente agente;
}
