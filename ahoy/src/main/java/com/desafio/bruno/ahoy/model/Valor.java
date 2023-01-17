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
public class Valor implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "valor_generator")
    @SequenceGenerator(name = "valor_generator", sequenceName = "valor_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    public String text;

}
