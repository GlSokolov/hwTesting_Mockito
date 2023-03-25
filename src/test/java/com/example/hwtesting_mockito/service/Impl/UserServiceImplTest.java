package com.example.hwtesting_mockito.service.Impl;

import com.example.hwtesting_mockito.model.User;
import com.example.hwtesting_mockito.service.UserDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.webjars.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    public static final String CORRECT_USERNAME = "Глеб Соколов";
    public static final String INCORRECT_USERNAME = "Денис Петров";
    public static final User CORRECT_USER = new User("Глеб Соколов", 24, "gl_sokolov");
    public static final User INCORRECT_USER = new User("Глеб Соколов,,i", 26, "zxc");



    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl out;


    @Test
    void shouldCheckForUserExistence() {

        when(userDaoMock.getUserByName(CORRECT_USERNAME)).thenReturn(CORRECT_USER);
        assertTrue(out.checkUserExist(CORRECT_USER));

    }

    @Test
    void shouldCheckForUserNonExistence() {

        when(userDaoMock.getUserByName(INCORRECT_USERNAME)).thenReturn(null);
        assertFalse(out.checkUserExist(INCORRECT_USER));

    }

}