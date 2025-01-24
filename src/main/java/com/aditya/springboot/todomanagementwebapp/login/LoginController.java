package com.aditya.springboot.todomanagementwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

//    @RequestMapping("login") // map to url
//    //@ResponseBody // using this annotation we are sending the string returned here as response so
//    // for returning the sayHello.jsp page just remove the @ResponseBody annotation
//    public String login(){
//        return "login";
//    }

    // http://localhost:8080/login?name=aditya ---->in this url there is one more request coming from
    // browser that is name we can hadle this using request param
    @RequestMapping("login") // map to url
    //@ResponseBody // using this annotation we are sending the string returned here as response so
    // for returning the sayHello.jsp page just remove the @ResponseBody annotation
    // when ever we want to pass anything from our controller to our jsp the way we can do that is by
    // putting that in a model
    public String login(@RequestParam String name, ModelMap model){
        model.put("name", name);
        System.out.println("Request param is : "+ name); // Not recommended for production code
        return "login";
    }

}
