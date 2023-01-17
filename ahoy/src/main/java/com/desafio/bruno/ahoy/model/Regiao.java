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
@Table(name = "regiao")
public class Regiao  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "regiao_generator")
    @SequenceGenerator(name = "regiao_generator", sequenceName = "regiao_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToOne
    public Attributes attributes;

    @OneToOne
    public Geracao geracao;

    @OneToOne
    public Compra compra;

    @OneToOne
    public PrecoMedio precoMedio;
}
