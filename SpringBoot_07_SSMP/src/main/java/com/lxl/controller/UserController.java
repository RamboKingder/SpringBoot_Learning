package com.lxl.controller;

import com.lxl.domain.User;
import com.lxl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping
    // 查询所有用户
    public List<User> getAll(){
        return iUserService.list();
    }

    @PostMapping
    // 新建一个用户
    public Boolean save(@RequestBody User user){
        return iUserService.save(user);
    }

    @PutMapping
    // 更新一个用户
    public Boolean update(@RequestBody User user){
        return iUserService.updateById(user);
    }

    @DeleteMapping("/{id}")
    // 根据id删除一个用户
    public Boolean delete(@PathVariable Integer id){
        return iUserService.removeById(id);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        return iUserService.getById(id);
    }

}
