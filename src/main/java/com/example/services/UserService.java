package com.example.services;

import com.example.Entity.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

  /*  private List<User> users= Arrays.asList(
            new User(1,"swarna","swarna@moneyview.in","swarna"),
            new User(2,"Madhuri","madhuri@moneyview.in","madhuri")
            );
    public List<User> getAllUsers(){
        return  users;
    } This is used when you do not use a repo object and u maintain a list*/
  @Autowired
  UserRepository repo;

    public User register(User newUser){
        repo.save(newUser);
        return newUser;
    }


}
