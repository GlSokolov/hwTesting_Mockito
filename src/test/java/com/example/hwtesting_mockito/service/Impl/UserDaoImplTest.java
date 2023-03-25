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
    public static final String INCORRECT_USERNAME = "Денис Петров";
    public static final String NULL = null;

    UserDaoImpl out = new UserDaoImpl();

    @Test
    void shouldGetUserByNameOrNull() {

        String result1 = out.getUserByName(CORRECT_USERNAME);
        Assertions.assertEquals(result1, CORRECT_USERNAME);

        String result2 = out.getUserByName(INCORRECT_USERNAME);
//        Assertions.assertEquals(result2, INCORRECT_USERNAME);

        Assertions.assertNotNull(result1, NULL);
        Assertions.assertNull(result2, NULL);

    }
}