package com.ticoyk.sfgdi.controllers;

import com.ticoyk.sfgdi.services.ConstructorGreetingService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController( new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
    
}
