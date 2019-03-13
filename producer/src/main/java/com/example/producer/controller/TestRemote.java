package com.example.producer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Primary
@FeignClient(name = "spring-cloud-consumer", fallback = TestRemoteHystrix.class)
public interface TestRemote {
    @GetMapping(value = "/test")
    String test(@RequestParam(value = "name") String name);
}