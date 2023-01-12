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
public class Codigo{

    public String _text;
}
