package com.sunil.CrudDemo.enity;


import jakarta.persistence.*;

@Entity
@Table(name= "employee")
public class Employee {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;


    //define construtor


    // no agrs contructor required for jpa
    public Employee(){

    }

    public Employee(String email, String lastName, String fristName) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = fristName;
    }
    // define getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fristName) {
        this.firstName = fristName;
    }


    // define tostring


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fristName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
