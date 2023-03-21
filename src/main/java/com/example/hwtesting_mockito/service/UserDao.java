package com.example.hwtesting_mockito.service;

import com.example.hwtesting_mockito.model.User;

import java.util.HashSet;

public interface UserDao {

    String getUserByName (String userName);
    HashSet<User> findAllUsers ();

}
