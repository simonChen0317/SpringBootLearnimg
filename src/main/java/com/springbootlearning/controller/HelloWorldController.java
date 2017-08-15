package com.springbootlearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Simon on 2017/8/14.
 */
@RestController //@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World! This is my first SpringBootDemo";
    }
}
