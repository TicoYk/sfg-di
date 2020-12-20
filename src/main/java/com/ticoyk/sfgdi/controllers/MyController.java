package com.ticoyk.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    @Autowired
    public String sayHello(){
        return "Hello!";
    }

}
