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
    @Column(name = "code", length = 4)
    private String codeCitizenship;
    @Column(name = "name", length = 50)
    private String nameCitizenship;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "citizenship")
    private Set<Person> personSet;

    public Citizenship(String codeCitizenship, String nameCitizenship) {
        this.codeCitizenship = codeCitizenship;
        this.nameCitizenship = nameCitizenship;
    }

    public void setCodeCitizenship(String codeCitizenship) {
        this.codeCitizenship = codeCitizenship;
    }

    public void setNameCitizenship(String nameCitizenship) {
        this.nameCitizenship = nameCitizenship;
    }

    public Set<Person> getPersonSet() {
        if (personSet == null) {
            personSet = new HashSet<>();
        }
        return personSet;
    }

    public void addPerson(Person person) {
        getPersonSet().add(person);
    }

    public void removePerson(Person person) {
        getPersonSet().remove(person);
    }

    public String getCodeCitizenship() {
        return codeCitizenship;
    }

    public String getNameCitizenship() {
        return nameCitizenship;
    }
}
