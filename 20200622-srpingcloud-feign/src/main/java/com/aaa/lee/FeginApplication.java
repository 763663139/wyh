package com.aaa.lee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author：wyh
 * @Created by:王宇航 on 2020/6/22 10:11
 ***/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class,args);
    }
}
