package com.iyut.dubbo.demo.provider;

import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "hello";
    }

    @Override
    public String sayBay() {
        return "bay";
    }
}
