package com.aditya.springboot.todomanagementwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // this annotaion is for showing that below class is something that handles
public class SayHelloController {
   // "say-hello" => "Hello! What are you learning today?"
    //say-hello ---> i want that when someone clicks on my url named say-hello he will get the above message
    // url ==>  http://localhost:8080/say-hello
    @RequestMapping("say-hello") // map to url
    @ResponseBody // using this annotation we are sending the string returned here as response
    public String sayHello(){
        return "Hello! What are you learning today?";
    }



    //"say-hello" => "Hello! What are you learning today?"
    //say-hello ---> i want that when someone clicks on my url named say-hello he will get the above message
    // url ==>  http://localhost:8080/say-hello
    @RequestMapping("say-hello-html") // map to url
    @ResponseBody // using this annotation we are sending the string returned here as response
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> say-hello-using-html</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h2>This is my body..!</h2>");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    // Showing the html page as the above page is very very hectic so we need to use some kind of view
    // technology like JSP(it is one of the earliest and popular view technology).
    // when someone goes to the url say-hello-jsp ===> we want to redirect them to sayHello.jsp page


    //src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
    //src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
// we will be making these pages what we can see here is only name of our jsp pages is canging
// so we can store our constant part in apllication properties as prefix and suffix
    @RequestMapping("say-hello-jsp") // map to url
    //@ResponseBody // using this annotation we are sending the string returned here as response so
    // for returning the sayHello.jsp page just remove the @ResponseBody annotation
    public String sayHelloJsp(){
        return "sayHello";
    }
}
