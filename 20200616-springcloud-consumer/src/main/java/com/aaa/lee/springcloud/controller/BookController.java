package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.Sys_config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/6/16 10:56
 * @Description
 **/
@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/all")
    public List<Sys_config> selectAllBooks() {
        // 需要去调用provider项目中的方法
        // 因为restful的风格就是controller去调用controller，所以需要配置restTemplate(spring公司默认提供了)
        // 必须要保证provider中controller使用的是get请求方式getForObject()
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }

}
