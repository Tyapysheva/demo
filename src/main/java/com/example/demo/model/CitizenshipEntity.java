package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citizenship")
public class CitizenshipEntity{
    @Id
    @Column(name="code")
    private short codeCitizenship;
    @Column(name = "name")
    private String nameCitizenship;

    public CitizenshipEntity(short codeCitizenship, String nameCitizenship){
        this.codeCitizenship=codeCitizenship;
        this.nameCitizenship=nameCitizenship;
    }

    public int codeCitizenship() {
        return codeCitizenship;
    }

    public String nameCitizenship() {
        return nameCitizenship;
    }
}
