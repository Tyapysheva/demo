package com.example.demo.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Version
    private int version;
    @Column(name="first_name",length = 25)
    private String firstName;
    @Column(name="middle_name",length =25)
    private String middleName;
    @Column(name="second_name",length =25)
    private String secondName;
    @Column(name="phone",length =15)
    private String phone;
    @Column(name="position",length =50)
    private String position;
    @Column(name="identified")
    private boolean identified;
    private Office office;
    private Set<Document> documentSet;
    private Set<Citizenship> citizenshipSet;
   // office_id integer,
   // foreign key(office_id)references office(id)


}
