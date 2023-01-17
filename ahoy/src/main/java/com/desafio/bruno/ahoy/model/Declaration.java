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
public class Declaration implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(generator = "declaration_generator")
    @SequenceGenerator(name = "declaration_generator", sequenceName = "declaration_sequence", initialValue = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Embedded
    public Attributes attributes;
}
