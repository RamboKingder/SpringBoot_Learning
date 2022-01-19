package com.lxl.controller;

import com.lxl.domain.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BootController {

    @Autowired // 使用自动装配将所有数据封装进去
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String GetById(){
        System.out.println("SpringBoot running......");
        System.out.println(env.getProperty("server.port"));
        System.out.println(myDataSource);
        return "Hello, SpringBoot2!";
    }

}
