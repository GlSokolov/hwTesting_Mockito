package com.example.hwtesting_mockito.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {

    String FullName;
    String age;
    String login;

    @Override
    public String toString() {
        return "User [" +
                "Имя: " + FullName + '\'' +
                " " + age + "лет" +  '\'' +
                ", логин: " + login + '\'' +
                ']';
    }
}
