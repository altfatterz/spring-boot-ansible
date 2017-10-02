package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        log.info("Hello World");
        return "Hello World";
    }
}
