package com.lxl.controller;

import com.lxl.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAll() {
        return "查询所有的用户";
    }

    @PostMapping
    public String save(@RequestBody User user) {
        return "新增了一个用户：" + user;
    }

    @PutMapping
    public String update(@RequestBody User user) {
        return "修改了一个用户：" + user;
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable int id){
        return "查询id为" + id + "的用户";
    }

    @DeleteMapping(value = "/{id}")
    public String deleteById(@PathVariable int id){
        return "删除id为" + id + "的用户";
    }



}
