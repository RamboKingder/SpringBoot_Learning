package com.lxl;

import com.lxl.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot06DruidApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Test
    void contextLoads() {
        System.out.println(accountDao.selectList(null));
    }

}
