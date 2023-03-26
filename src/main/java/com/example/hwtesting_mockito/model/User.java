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

   private final String FullName;
   private final int age;
   private final String login;

    @Override
    public String toString() {
        return "User [" +
                "Имя: " + FullName + '\'' +
                " " + age + "лет" +  '\'' +
                ", логин: " + login + '\'' +
                ']';
    }
}
