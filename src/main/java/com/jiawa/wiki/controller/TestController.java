package com.jiawa.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController //一般用来返回字符串
//@Controller  //一般用来返回页面
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/hello")
    public String hello(String name){
        return "hello map!" + name;
    }

}
