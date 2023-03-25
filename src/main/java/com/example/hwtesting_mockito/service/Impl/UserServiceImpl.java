package com.example.hwtesting_mockito.service.Impl;

import com.example.hwtesting_mockito.model.User;
import com.example.hwtesting_mockito.service.UserDao;
import com.example.hwtesting_mockito.service.UserService;
import org.webjars.NotFoundException;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public boolean checkUserExist(User user) {
        try {
            userDao.getUserByName(user.getFullName());
            return true;
        } catch (NotFoundException e) {
            return false;
        }
    }
}
