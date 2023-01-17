package com.desafio.bruno.ahoy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString()
@Entity
public class Valor implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "valor_generator")
    @SequenceGenerator(name = "valor_generator", sequenceName = "valor_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    private String text;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Geracao geracao;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Compra compra;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private PrecoMedio precoMedio;
}
