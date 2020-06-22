package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.Sys_config;
import com.aaa.lee.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author：wyh
 * @Created by:王宇航 on 2020/6/18 15:09
 ***/
@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public List<Sys_config> selectAllBooks(){
        System.out.println("8082");
        return bookService.selectAllBooks();
    }
}
