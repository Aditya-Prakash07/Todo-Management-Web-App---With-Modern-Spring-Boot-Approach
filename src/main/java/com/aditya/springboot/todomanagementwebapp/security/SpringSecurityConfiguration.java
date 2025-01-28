package com.aditya.springboot.todomanagementwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
    // For storing user name and password we should make use of LDAP or at leat a database
    // to keep things simple we will use here in memory configurer
    //InMemoryUserDetailsManager
    //InMemoryUserDetailsManager(UserDetails... users)

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        // Create a user with username, password, and roles
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("adi")
                .password("dummy")
                .roles("USER", "ADMIN")
                .build();

        // Return InMemoryUserDetailsManager with the created user
        return new InMemoryUserDetailsManager(userDetails);
    }
}

