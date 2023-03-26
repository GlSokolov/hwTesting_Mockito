package com.example.hwtesting_mockito.service.Impl;

import com.example.hwtesting_mockito.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {

    public static final String CORRECT_USERNAME = "Глеб Соколов";
    public static final User CORRECT_USER = new User("Глеб Соколов", 24, "gl_sokolov");
    public static final String INCORRECT_USERNAME = "Денис Петров";
    public static final User NULL_USER = null;
    public static final String NULL = null;

    UserDaoImpl out = new UserDaoImpl();

    @Test
    void shouldGetUserByName() {

        Assertions.assertEquals(out.getUserByName(CORRECT_USERNAME), CORRECT_USER);

        Assertions.assertNotNull(out.getUserByName(CORRECT_USERNAME), NULL);


    }

    @Test
    void shouldGetByUserNameNull() {

        Assertions.assertEquals(out.getUserByName(INCORRECT_USERNAME), NULL_USER);

        Assertions.assertNull(out.getUserByName(INCORRECT_USERNAME), NULL);

    }


}