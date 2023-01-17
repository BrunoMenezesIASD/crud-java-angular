package com.desafio.bruno.ahoy.model;

import lombok.*;

import javax.persistence.Embeddable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString()
@Embeddable
public class Attributes {

    public String version;

    public String encoding;

    public String versao;

    public String sigla;
}
