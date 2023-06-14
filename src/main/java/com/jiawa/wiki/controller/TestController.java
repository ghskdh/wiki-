package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //一般用来返回字符串
//@Controller  //一般用来返回页面
public class TestController {

    @Value("${test.hello:TEST}")  //冒号后面的是默认值，万一配置文件没有配置成功，就会使用这个默认值
    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/hello")
    public String hello(String name){
        return "hello map!" + name;
    }

}
