package com.aditya.springboot.todomanagementwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
    // For storing username and password, it is recommended to use LDAP or a database.
    // To keep things simple, we will use in-memory configuration here.

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        // Create a user with username, password, and roles
        UserDetails userDetails = User.builder()
                .username("adi")
                .passwordEncoder(passwordEncoder()::encode) // Pass the encoder reference directly
                .password("dummy")
                .roles("USER", "ADMIN")
                .build();

        // Return InMemoryUserDetailsManager with the created user
        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


