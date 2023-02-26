package com.example.Sql_Rockss;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
//     the first thing in the jpa repository is used to define like with whom to connect means database kisse connect hona chah raha hai
//    the second is what is the type of primary key

}
