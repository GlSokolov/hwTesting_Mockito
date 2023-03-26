package com.example.hwtesting_mockito.service;

import com.example.hwtesting_mockito.model.User;

import java.util.HashSet;

public interface UserDao {

    User getUserByName (String userName);
    HashSet<User> findAllUsers ();

}
