package com.aditya.springboot.todomanagementwebapp.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUsername = username.equalsIgnoreCase("adi");
        boolean isValidPassword = password.equalsIgnoreCase("a");
        return isValidUsername && isValidPassword;

    }
}
