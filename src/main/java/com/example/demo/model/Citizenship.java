package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//Гражданство
@Entity
@Table(name = "citizenship")
public class Citizenship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Version
    private int version;               //служебное поле hibernate
    @Column(name = "code",length = 4)
    private String codeCitizenship;
    @Column(name = "name",length = 50)
    private String nameCitizenship;

    private Set<Person> personSet;

    public Citizenship(String codeCitizenship, String nameCitizenship) {
        this.codeCitizenship = codeCitizenship;
        this.nameCitizenship = nameCitizenship;
    }

    public String codeCitizenship() {
        return codeCitizenship;
    }

    public String nameCitizenship() {
        return nameCitizenship;
    }
}
