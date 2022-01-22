package com.lxl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxl.domain.User;

import com.lxl.dao.UserDao;
import com.lxl.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 extends ServiceImpl<UserDao, User> implements IUserService {
}
