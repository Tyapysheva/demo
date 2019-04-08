package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class DocumentEntity {
    @Id
    @Column(name = "code")
    private byte codeDoc;
    @Column(name = "name")
    private String nameDoc;

    public DocumentEntity(byte codeDoc, String nameDoc) {
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
