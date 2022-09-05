package com.GADJET.Sprint_3_4.entities;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    //Atributos
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "amount", nullable = false)
    private double amount;
    @Column(name = "employee", nullable = false)
    private String employee;
    @Column(name = "concept", nullable = false)
    private String concept;
    private enum typeTran{
        Incomes,
        Expenses
    }
    @Column(name = "type")
    typeTran type;

    //Constructor vacio
    public Transaction() {
    }

    //Constructor con parametros
    public Transaction(long id, double amount, String employee, String concept, typeTran type) {
        this.id = id;
        this.amount = amount;
        this.employee = employee;
        this.concept = concept;
        this.type = type;
    }

    //Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public typeTran getType() {
        return type;
    }

    public void setType(typeTran type) {
        this.type = type;
    }
}
