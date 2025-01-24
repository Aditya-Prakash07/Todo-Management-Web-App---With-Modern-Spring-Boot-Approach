package com.aditya.springboot.todomanagementwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // this annotaion is for showing that below class is something that handles web-request
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"
    //say-hello ---> i want that when someone clicks on my url named say-hello he will get the above message
    // url ==>  http://localhost:8080/say-hello
    @RequestMapping("say-hello") // map to url
    @ResponseBody // using this annotation we are sending the string returned here as response
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

}
