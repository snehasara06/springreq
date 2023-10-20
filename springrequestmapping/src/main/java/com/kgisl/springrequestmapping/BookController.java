package com.kgisl.springrequestmapping;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@ComponentScan(basePackages = "com.kgisl.springrequestmapping")
@Controller
public class BookController {

   // HTTP Method
   // PathVariable
   @RequestMapping(value = "/book/{name}", method = RequestMethod.GET)
   public String bookName(@PathVariable String name, Model model) {
      model.addAttribute("bookname", name);
      return "book"; // Assuming "book" is the name of your view
   }

   // Multiple URI
   @RequestMapping(value = { "/books", "/books/all" })
   public String booklist() {
      return "booklist";
   }

   @RequestMapping(value = "/booklist", method = RequestMethod.GET)
   public String bookid(@RequestParam(name = "name", required = false, defaultValue = "User") String name,
         Model model) {
      model.addAttribute("pageTitle", "Collections");
      model.addAttribute("pageContent", "Hello, " + name + "!");
      return "booklist";

   }

   @RequestMapping(value = "/greet", method = RequestMethod.GET)
   public String greet(@RequestParam("name") String name, Model model) {
      String greetingMessage = "Hello, " + name + "!";
      model.addAttribute("greeting", greetingMessage);
      return "book";
   }

   // @RequestMapping(value = "/",headers ="name=sneha", method = RequestMethod.GET)
   // // @ResponseBodys
   // public String bookname(@PathVariable String name) {
   //    System.out.println();
   //    return "book";
   // }


   
}
