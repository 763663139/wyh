package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.Sys_config;
import com.aaa.lee.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Sys_config> selectAllBooks() {
        System.out.println("8081");
        return bookService.selectAllBooks();
    }

}
