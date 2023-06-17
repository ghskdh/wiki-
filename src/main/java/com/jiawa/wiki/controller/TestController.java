package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //一般用来返回字符串
//@Controller  //一般用来返回页面
public class TestController {

    @Value("${test.hello:TEST}")  //冒号后面的是默认值，万一配置文件没有配置成功，就会使用这个默认值
    private String testHello;

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "hello world! " + testHello;
    }

    @PostMapping("/hello")
    public String hello(String name){
        return "hello map!" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }

}
