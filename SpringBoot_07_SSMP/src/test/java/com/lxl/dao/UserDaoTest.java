package com.lxl.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxl.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test // 分页查询
    public void testGetPage(){
        IPage page = new Page(2, 5);
        IPage ipage = userDao.selectPage(page, null);
        List<User> users = ipage.getRecords();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test // 测试条件查询
    public void testGetByCondition(){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.like("username", "l");
        userDao.selectList(qw);
    }



    @Test
    public void testSelectById(){
        System.out.println("查询单个：userDao.selectById(id):");
        System.out.println(userDao.selectById(11));
    }

    @Test
    public void testSelectAll(){
        System.out.println("查询所有：userDao.selectList(null):");
        List<User> users = userDao.selectList(null);
    }

    @Test
    public void testInsert(){
        System.out.println("插入一条数据：");
        User user01 = new User();
        user01.setUsername("插入测试数据");
        user01.setPassword("插入测试数据");
        user01.setBirthday(666666666L);
        userDao.insert(user01);

    }
}
