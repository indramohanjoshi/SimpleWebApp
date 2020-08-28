package com.example.SimpleWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @GetMapping("/welcome")
    public String welcome(){
        return "<h1> Welcome !! <h1>";
    }
}
