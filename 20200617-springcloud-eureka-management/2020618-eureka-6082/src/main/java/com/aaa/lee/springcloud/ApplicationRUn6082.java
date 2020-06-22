package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author：wyh
 * @Created by:王宇航 on 2020/6/18 15:27
 ***/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRUn6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRUn6082.class,args);
    }
}
