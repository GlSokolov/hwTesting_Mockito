package com.example.hwtesting_mockito.service.Impl;

import com.example.hwtesting_mockito.model.User;
import com.example.hwtesting_mockito.service.UserDao;

import java.util.HashSet;

public class UserDaoImpl implements UserDao {

    HashSet<User> userList = new HashSet<>();

    @Override
    public String getUserByName(String userName) {
        return null;
    }

    @Override
    public HashSet<User> findAllUsers() {
        return null;
    }
}
