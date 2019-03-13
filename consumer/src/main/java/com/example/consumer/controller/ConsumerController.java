package com.example.consumer.controller;

import com.example.consumer.utils.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    private final HelloRemote helloRemote;

    @Autowired
    public ConsumerController(HelloRemote HelloRemote) {
        this.helloRemote = HelloRemote;
    }

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

    @GetMapping("/test")
    public String hello(@RequestParam String name) {
        return "hello " + name + ", this is first message";
    }

    @GetMapping("/config")
    public String config() {
        return Config.hello;
    }

}