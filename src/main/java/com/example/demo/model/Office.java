package com.example.demo.model;

import javax.persistence.*;
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

    private Organization organization;
    private Set<Person> personSet;

}
