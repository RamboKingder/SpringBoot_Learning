package com.lxl.service.impl;

import com.lxl.dao.UserDao;
import com.lxl.domain.User;
import com.lxl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Boolean save(User user) {
        return  userDao.insert(user) > 0;
    }

    @Override
    public Boolean update(User user) {
        return userDao.updateById(user) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return userDao.deleteById(id) > 0;
    }

    @Override
    public User getById(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.selectList(null);
    }
}
