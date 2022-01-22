package com.lxl.service;

import com.lxl.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetById(){
        User user = userService.getById(6);
        System.out.println("=======================================================");
        System.out.println(user);
    }

}
