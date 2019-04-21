package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
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
    @Column(name = "code", length = 4)
    private String codeDoc;
    @Column(name = "name", length = 150)
    private String nameDoc;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "document_type")
    private Set<Document> documentSet;

    public DocumentType(String codeDoc, String nameDoc) {
        this.codeDoc = codeDoc;
        this.nameDoc = nameDoc;
    }

    public String setCodeDoc() {
        return codeDoc;
    }

    public String setNameDoc() {
        return nameDoc;
    }

    public String getCodeDoc() {
        return codeDoc;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public Set<Document> getDocumentSet() {
        if (documentSet == null) {
            documentSet = new HashSet<>();
        }
        return documentSet;
    }

    public void addDocument(Document document) {
        getDocumentSet().add(document);
    }

    public void removeDocument(Document document) {
        getDocumentSet().remove(document);
    }
}
