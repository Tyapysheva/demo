package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;
    @Column(name = "doc_number",length = 50)
    private String docNumber;
    @Column(name = "date")
    private Date date;

    private DocumentType docType;

}
