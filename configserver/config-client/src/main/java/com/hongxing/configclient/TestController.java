package com.hongxing.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
public class TestController {

    @Value("${server.env}")
    private String env;

    @GetMapping
    public String getEnv(){
        return env;
    }
}
