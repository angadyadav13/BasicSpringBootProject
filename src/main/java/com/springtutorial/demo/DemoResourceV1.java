package com.springtutorial.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoResourceV1 {

    @GetMapping("/hello/v1")
    public String firstAPI(){
        return "Hello World";
    }

}

