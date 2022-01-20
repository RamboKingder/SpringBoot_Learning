package com.lxl;

import com.lxl.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot05MyBatisPlusApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Test
    void contextLoads() {
        System.out.println(accountDao.selectById(2));
        System.out.println(accountDao.selectList(null));

    }

}
