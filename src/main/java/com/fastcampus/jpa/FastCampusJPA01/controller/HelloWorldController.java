package com.fastcampus.jpa.FastCampusJPA01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String HelloWorld(){

        return "HelloWorld";
    }
}
