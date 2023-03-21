package com.example.hwtesting_mockito.service.Impl;

import com.example.hwtesting_mockito.model.User;
import com.example.hwtesting_mockito.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public boolean checkUserExist(User user) {
        return false;
    }

}
