package com.example.hwtesting_mockito.service.Impl;

import com.example.hwtesting_mockito.model.User;
import com.example.hwtesting_mockito.service.UserDao;
import org.webjars.NotFoundException;

import java.util.HashSet;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public static final User USER1 = new User("Глеб Соколов", 24, "gl_sokolov");
    public static final User USER2 = new User("Гена Цидармян", 43, "Golovach_Lena");
    public static final User USER3 = new User("Яна Цист", 24, "Yazagit_Lera");

    private final HashSet<User> userList = new HashSet<>(List.of(USER1, USER2, USER3));

    @Override
    public String getUserByName(String userName) {
        try {
            userList.stream()
                    .filter(user -> user.getFullName().equals(userName))
                    .findAny()
                    .orElseThrow(() -> new NotFoundException("<Пользователь не найден>"));
            return userName;
        } catch (NotFoundException e) {
            return null;
        }
    }

    @Override
    public HashSet<User> findAllUsers() {
        try {
            return userList;
        } catch (NotFoundException e) {
            throw new NotFoundException("<Список пуст>");
        }
    }
}
