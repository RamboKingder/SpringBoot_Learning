package com.lxl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BootController {

    @GetMapping
    public String GetById(){
        System.out.println("SpringBoot running......2");
        return "Hello, SpringBoot2!2222";
    }

}
