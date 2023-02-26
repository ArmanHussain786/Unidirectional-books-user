package com.example.Sql_Rockss;

import jakarta.persistence.*;

@Entity
@Table(name="Library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int fine;

    private int bookIssue;




    @Enumerated(value = EnumType.STRING) // to store values in db in string format
    private CardStatus cardStatus;


    @OneToOne  // mapping one to one parent and child
    @JoinColumn //you are telling add a foreign key , define the Column name of the parent class
    User user;



}
