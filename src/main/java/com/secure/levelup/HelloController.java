package com.secure.levelup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "Welcome to Spring Oauth2! Authentication";
    }
}
