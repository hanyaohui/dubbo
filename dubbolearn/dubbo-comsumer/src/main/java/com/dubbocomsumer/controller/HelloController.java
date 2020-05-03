package com.dubbocomsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.commoninterface.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "1.0.0", check = false)
    public HelloService helloService;

    @RequestMapping("/test")
    public void test() {
        System.out.println("before");
        try {
            System.out.println("RPC返回: " + helloService.getHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}
