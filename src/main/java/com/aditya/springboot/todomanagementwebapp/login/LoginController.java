package com.aditya.springboot.todomanagementwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("login") // map to url
    //@ResponseBody // using this annotation we are sending the string returned here as response so
    // for returning the sayHello.jsp page just remove the @ResponseBody annotation
    public String login(){
        return "login";
    }

}
