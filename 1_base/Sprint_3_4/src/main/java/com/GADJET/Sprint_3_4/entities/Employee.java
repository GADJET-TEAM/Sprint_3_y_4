package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee {

    //Atributos y columnas de entidades

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "enterprise")
    private String enterprise;

    private enum role{
        Manager,
        Operative;
    }

    @Column(name = "role")
    private role roleName;

    // Constructor vacio
    public Employee() {
    }

    // Constructor con parametros
    public Employee(long id, String name, String email,String enterprise, role roleName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.roleName = roleName;
    }

    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public role getRoleName() {
        return roleName;
    }

    public void setRoleName(role roleName) {
        this.roleName = roleName;
    }
}
