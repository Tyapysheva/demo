package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;
    @Column(name = "doc_number", length = 50)
    private String docNumber;
    @Column(name = "doc_date")
    private Date date;
    @OneToOne(mappedBy = "document", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Person person;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_document_type")
    private DocumentType docType;

    public Document(String docNumber, Date date) {
        this.docNumber = docNumber;
        this.date = date;
    }

    public void setDocumentType(DocumentType documentType) {
        this.docType = documentType;
    }

    public DocumentType getDocumentType() {
        return docType;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

}
