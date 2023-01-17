package com.desafio.bruno.ahoy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Getter
@Setter
@ToString()
@Embeddable
public class Data {

    @Embedded
    @Temporal(TemporalType.TIMESTAMP)
    public Date text;
}
