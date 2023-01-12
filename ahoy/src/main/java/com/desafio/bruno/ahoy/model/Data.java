package com.desafio.bruno.ahoy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Date;

@Getter
@Setter
@ToString()
@Embeddable
@lombok.Data
public class Data {

    @Embedded
    public Date _text;
}
