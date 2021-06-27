package com.springboot.springboottest;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringboottestApplication {



//    @RequestMapping("/hello")
//    public String index(){
//        return "Hello World， Spring boot is good";
//    }


    @RequestMapping("/hello")
    public String index(){
        return "hello World,spring boot is good";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringboottestApplication.class, args);
    }
}
