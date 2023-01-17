package com.desafio.bruno.ahoy.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString()
@Entity
public class Agente implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "agente_generator")
    @SequenceGenerator(name = "agente_generator", sequenceName = "agente_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToOne
    private Codigo codigo;

    @OneToOne
    private Data data;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "agente_id_fk", insertable = false, updatable = false)
    private List<Regiao> regiao;
}
