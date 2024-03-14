package com.example.azurespringapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TestController {

    @GetMapping("test")
    public String getMethodName() {
        return "Welcome to Azure POC meeting";
    }
    
}
