package com.example.ci_cd_ec2_springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcomeMessage(){
        return "Hello, everyone!";
    }
}
