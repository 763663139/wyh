package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.mapper.Sys_configMapper;
import com.aaa.lee.springcloud.model.Sys_config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private Sys_configMapper sys_configMapper;


    public List<Sys_config> selectAllBooks() {
        return sys_configMapper.selectAll();
    }

}
