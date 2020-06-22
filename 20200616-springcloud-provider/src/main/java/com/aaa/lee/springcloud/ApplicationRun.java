package com.aaa.lee.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/6/16 11:09
 * @Description
 **/
@SpringBootApplication
@MapperScan("com.aaa.lee.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }

}
