package com.desafio.bruno.ahoy.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.util.List;

@Getter
@Setter
@ToString()
@Embeddable
@Data
public class Compra{

    public List<Valor> valor;
}
