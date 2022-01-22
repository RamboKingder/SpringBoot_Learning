package com.lxl.controller;

import com.lxl.domain.User;
import com.lxl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.lxl.utils.R;

@RestController
@RequestMapping("/users")
public class NewUserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping
    // 查询所有用户
    public R getAll(){
        return new R(true, iUserService.list());
    }

    @PostMapping
    // 新建一个用户
    public R save(@RequestBody User user){
        return new R(iUserService.save(user));
    }

    @PutMapping
    // 更新一个用户
    public R update(@RequestBody User user){
        return new R(iUserService.updateById(user));
    }

    @DeleteMapping("/{id}")
    // 根据id删除一个用户
    public R delete(@PathVariable Integer id){
        return new R(iUserService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, iUserService.getById(id));
    }

}
