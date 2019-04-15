package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

//Документ
@Entity
@Table(name = "document_type")
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;          //служебное поле hibernate
    @Column(name = "code",length = 4)
    private String codeDoc;
    @Column(name = "name",length = 150)
    private String nameDoc;

    private Set<Document> documentSet;

    public DocumentType(String codeDoc, String nameDoc) {
        this.codeDoc = codeDoc;
        this.nameDoc = nameDoc;
    }

    public String codeDoc() {
        return codeDoc;
    }

    public String nameDoc() {
        return nameDoc;
    }
}
