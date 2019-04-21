package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "office")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;
    @Column(name = "name", length = 20)
    private String name;
    @Column(name = "address", length = 200)
    private String address;
    @Column(name = "phone", length = 15)
    private String phone;
    @Column(name = "active")
    private boolean active;
    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_org", nullable = false)
    private Organization organization;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "office")
    private Set<Person> personSet;

    public Office(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return active;
    }

    public Organization getOrganization() {
        return organization;
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
}
