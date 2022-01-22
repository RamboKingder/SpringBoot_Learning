package com.lxl.domain;

import lombok.Data;

// lombok: Java类库，使用注解简化POJO实体类的开发
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private Long birthday;

}
