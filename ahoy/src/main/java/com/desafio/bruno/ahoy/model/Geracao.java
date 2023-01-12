package com.desafio.bruno.ahoy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Getter
@Setter
@ToString()
@Embeddable
@Data
public class Geracao{
    public ArrayList<Valor> valor;
}
