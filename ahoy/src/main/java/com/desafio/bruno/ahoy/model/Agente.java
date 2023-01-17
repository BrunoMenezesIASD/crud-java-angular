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
    @GeneratedValue(generator = "resources_generator")
    @SequenceGenerator(name = "resources_generator", sequenceName = "resources_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Embedded
    public Codigo codigo;

    @Embedded
    public Data data;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "agente_id", insertable = false, updatable = false)
    public List<Regiao> regiao;
}
