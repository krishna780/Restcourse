package com.example.demo.aspect;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public  void addAccount(){
        System.out.println(getClass()+": doing my db work: adding an account");
    }
}
