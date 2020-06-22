package com.aaa.lee.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

/**
 * @Author：wyh
 * @Created by:王宇航 on 2020/6/18 14:52
 ***/
@RestController
//@RequestMapping("com.aaa.lee.springcloud.mapper")
//@RibbonClient(name = "")
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject("http://book-interface/all",List.class);
    }
}
