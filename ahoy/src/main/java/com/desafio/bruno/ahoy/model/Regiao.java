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
@Table(name = "regiao")
public class Regiao  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "regiao_generator")
    @SequenceGenerator(name = "regiao_generator", sequenceName = "regiao_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Embedded
    public Attributes attributes;

    @Embedded
    public Geracao geracao;

    @Embedded
    public Compra compra;

    @Embedded
    public PrecoMedio precoMedio;
}
