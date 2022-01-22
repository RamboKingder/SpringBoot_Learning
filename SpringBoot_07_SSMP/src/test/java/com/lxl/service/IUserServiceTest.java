package com.lxl.service;

import com.lxl.service.impl.UserServiceImpl2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IUserServiceTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void test(){
        iUserService.removeById(28);
    }
}
