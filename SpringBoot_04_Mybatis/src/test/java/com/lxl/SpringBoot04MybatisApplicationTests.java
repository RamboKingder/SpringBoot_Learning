package com.lxl;

import com.lxl.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot04MybatisApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		System.out.println(userDao.getById(1));

	}

}
