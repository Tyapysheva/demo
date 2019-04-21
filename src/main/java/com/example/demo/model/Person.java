package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;
    @Column(name = "first_name", length = 25)
    private String firstName;
    @Column(name = "middle_name", length = 25)
    private String middleName;
    @Column(name = "second_name", length = 25)
    private String secondName;
    @Column(name = "phone", length = 15)
    private String phone;
    @Column(name = "position", length = 50)
    private String position;
    @Column(name = "identified")
    private boolean identified;
    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_office", nullable = false)
    private Office office;
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Document document;
    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_citizenship", nullable = false)
    private Citizenship citizenship;

    public Person(String firstName, String secondName, String phone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public boolean isIdentified() {
        return identified;
    }

    public Office getOffice() {
        return office;
    }

    public Document getDocument() {
        return document;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setIdentified(boolean identified) {
        this.identified = identified;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setCitizenship(Citizenship citizenship) {
        this.citizenship = citizenship;
    }
}
