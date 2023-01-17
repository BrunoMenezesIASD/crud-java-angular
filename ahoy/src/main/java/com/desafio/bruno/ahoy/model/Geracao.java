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

public class Geracao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "geracao_generator")
    @SequenceGenerator(name = "geracao_generator", sequenceName = "geracao_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "valor_id", insertable = false, updatable = false)
    public List<Valor> valorGeracao;

    @OneToOne
    private Regiao regiao;

}
