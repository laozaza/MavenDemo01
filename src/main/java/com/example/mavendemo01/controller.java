package com.example.mavendemo01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/hlleo")
    public String hello(){
        System.out.println("asfasfasfajasf");
        return "hello";
    }
}
