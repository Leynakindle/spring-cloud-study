package com.example.producer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class TestRemoteHystrix implements TestRemote {
    @Override
    public String test(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed ";
    }
}