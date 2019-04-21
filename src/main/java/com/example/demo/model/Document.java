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
    @Column(name = "date")
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_doctype", nullable = false)
    private DocumentType docType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_person")
    private Person person;

    public Document(String docNumber, Date date) {
        this.docNumber = docNumber;
        this.date = date;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDocType(DocumentType docType) {
        this.docType = docType;
    }


    public String getDocNumber() {
        return docNumber;
    }

    public Date getDate() {
        return date;
    }

    public DocumentType getDocType() {
        return docType;
    }
}
