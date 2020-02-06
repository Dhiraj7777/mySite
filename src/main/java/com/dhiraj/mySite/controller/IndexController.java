/**
dbf1jps
*/
package com.dhiraj.mySite.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
    @RequestMapping("/welcome")
    public String home() {
      //  model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }
     
    @RequestMapping("/next")
    public String next() {
      //  model.put("message", "You are in new page !!");
        return "next";
    }

}
