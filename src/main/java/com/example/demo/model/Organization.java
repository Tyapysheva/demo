package com.example.demo.model;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Version
    private int version;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "full_name", length = 200)
    private String fullName;
    @Column(name = "inn", length = 12)
    private String inn;
    @Column(name = "kpp", length = 9)
    private String kpp;
    @Column(name = "address", length = 200)
    private String address;
    @Column(name = "phone", length = 15)
    private String phone;
    @Column(name = "active")
    private boolean isActive;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "organization")
    private Set<Office> officeSet;

    public Organization(String fullName, String inn, String kpp) {
        this.fullName = fullName;
        this.inn = inn;
        this.kpp = kpp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }

    public String getKpp() {
        return kpp;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return isActive;
    }

    public Set<Office> getOfficeSet() {
        if (officeSet == null) {
            officeSet = new HashSet<>();
        }
        return officeSet;
    }

    public void addOffice(Office office) {
        getOfficeSet().add(office);
    }

    public void removeOffice(Office office) {
        getOfficeSet().remove(office);
    }

}
