package com.aaa.lee.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author：wyh
 * @Created by:王宇航 on 2020/6/18 16:07
 ***/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.lee.springcloud.mapper")
public class ApplicationRun8083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class,args);
    }
}
