package com.example.Sql_Rockss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user)
    {
       userRepository.save(user);
       return "Student added succesfully";
    }

    public User getUser(int id)
    {
        User user = userRepository.findById(id).get();
        return user;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
