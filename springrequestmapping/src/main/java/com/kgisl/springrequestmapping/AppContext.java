package com.kgisl.springrequestmapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kgisl.springrequestmapping")
public class AppContext {
{
    System.out.println("App context");
}

}
