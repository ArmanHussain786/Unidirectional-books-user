package com.example.Sql_Rockss;


import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Books {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)  // id parameter will auto genrated
    //user does not need to send it from the postman
    private int id;
    private String name;
    private  String pages;

    public Books() {

    }


    //connecting with the author class
    @ManyToOne
    @JoinColumn
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
