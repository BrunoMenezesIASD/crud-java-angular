package com.desafio.bruno.ahoy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString()
@Data
@Entity
@Table(name = "regiao")
public class Regiao {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    public Attributes _attributes;

    @Embedded
    public Geracao geracao;

    @Embedded
    public Compra compra;

    @Embedded
    public PrecoMedio precoMedio;
}
