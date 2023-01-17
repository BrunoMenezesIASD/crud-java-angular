package com.desafio.bruno.ahoy.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString()
@Entity
public class PrecoMedio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "precomedio_generator")
    @SequenceGenerator(name = "precomedio_generator", sequenceName = "precomedio_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "valor_id", insertable = false, updatable = false)
    private List<Valor> valorPreco;

    @OneToOne
    private Regiao regiao;
}
