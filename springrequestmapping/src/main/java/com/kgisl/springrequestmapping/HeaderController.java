package com.kgisl.springrequestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

 

 

@Controller
@RequestMapping("/")
public class HeaderController {

 

    @RequestMapping(value = "showheaders", method = RequestMethod.GET, headers = "User-Name=Madhu")
    public String showHeaders(HttpServletRequest request) {
        // Get and print the values of specific headers
        String userAgent = request.getHeader("User-Agent");
        String acceptLanguage = request.getHeader("Accept-Language");
        String username=request.getHeader("User-Name");
 

        System.out.println("User-Agent: " + userAgent);
        System.out.println("Accept-Language: " + acceptLanguage);
        System.out.println("Username is "+ username);

 

        // You can add further processing logic here

 

        return "showheaders"; // Return the name of the view (e.g., JSP, Thymeleaf, etc.)
    }
}

