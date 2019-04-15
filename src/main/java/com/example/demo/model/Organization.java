package com.example.demo.model;

import javax.persistence.*;

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
    private Set<Office> officeSet;

}
