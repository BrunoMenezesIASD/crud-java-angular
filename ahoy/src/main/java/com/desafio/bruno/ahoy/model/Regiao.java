package com.desafio.bruno.ahoy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Setter
@ToString()
@Embeddable
@Data
public class Regiao {

    @Embedded
    public Attributes _attributes;

    @Embedded
    public Geracao geracao;

    @Embedded
    public Compra compra;

    @Embedded
    public PrecoMedio precoMedio;
}
