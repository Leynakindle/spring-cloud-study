package com.example.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final TestRemote testRemote;

    @Autowired
    public HelloController(TestRemote testRemote) {
        this.testRemote = testRemote;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + ", this is first message";
    }

    @GetMapping("/test/{name}")
    public String index(@PathVariable("name") String name) {
        return testRemote.test(name);
    }

}