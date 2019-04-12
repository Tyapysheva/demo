package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

//Документ
@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;          //служебное поле hibernate
    @Column(name = "code")
    private byte codeDoc;
    @Column(name = "name",length = 150)
    private String nameDoc;
    private Set<Person> personSet;

    public Document(byte codeDoc, String nameDoc) {
        this.codeDoc = codeDoc;
        this.nameDoc = nameDoc;
    }

    public int codeDoc() {
        return codeDoc;
    }

    public String nameDoc() {
        return nameDoc;
    }
}
