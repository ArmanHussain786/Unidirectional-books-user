package com.example.Sql_Rockss;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Tables;

@Entity
@Table(name = "user_info")
public class User {
    @Id // It is written so that attribute can become private key
    @Column(unique = true)
    private int id;

    @Column(unique = true)
    private String email;
    private String name;
    private String age;

    @Column(name="country_name")
    private String country;

    //always create default constructors
    public User()
    {

    }
    //good practice to construct the arg constructor always

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
