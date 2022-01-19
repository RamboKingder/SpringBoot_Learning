package com.lxl.dao.impl;

import com.lxl.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao running......");
    }
}
