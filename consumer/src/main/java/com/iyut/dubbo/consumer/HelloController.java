package com.iyut.dubbo.consumer;

import com.iyut.dubbo.demo.provider.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class HelloController {

    @Resource
    private DemoService demoService;

    @GetMapping("/")
    public void sayHello(){
        System.out.println(demoService.sayHello());
    }

}
