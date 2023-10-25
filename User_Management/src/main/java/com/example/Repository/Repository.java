package com.example.Repository;

import com.example.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    List <User> users;

    public List<User> getListOfUsers() {
        return users;
    }

    public void delete(User user){
        users.remove(user);
    }

}
