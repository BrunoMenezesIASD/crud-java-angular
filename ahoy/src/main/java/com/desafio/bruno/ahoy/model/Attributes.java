package com.desafio.bruno.ahoy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;

@Getter
@Setter
@ToString()
@Embeddable
@Data
public class Attributes{
    public String version;
    public String encoding;
    public String versao;
    public String sigla;
}
