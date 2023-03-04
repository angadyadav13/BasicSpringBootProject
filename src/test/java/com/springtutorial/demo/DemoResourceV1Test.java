package com.springtutorial.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class DemoResourceV1Test {

    @Autowired
    DemoResourceV1 demoResourceV1;

    @Test
    public void testFirstAPI(){
        System.out.println("Test our First Demo API");
        assertTrue(demoResourceV1.firstAPI().equals("Hello World"));
    }

}
