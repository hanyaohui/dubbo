package com.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.commoninterface.service.HelloService;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHello() {
        return "hello dubbo";
    }
}
