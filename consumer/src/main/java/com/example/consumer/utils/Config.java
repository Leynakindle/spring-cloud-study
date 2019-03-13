package com.example.consumer.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {

    public static String hello;

    @Value("${hello}")
    public void setHello(String hello) {
        Config.hello = hello;
    }

}