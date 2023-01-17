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
@EqualsAndHashCode
@Entity
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "compra_generator")
    @SequenceGenerator(name = "compra_generator", sequenceName = "compra_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "valor_id", insertable = false, updatable = false)
    public List<Valor> valorCompra;

    @OneToOne
    private Regiao regiao;

}
