package com.example.microservice3.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/microservice3")
public class Microservice3Controller {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello from Microservice 3";
    }

    @PostMapping("/data")
    public String postData(@RequestBody Map<String, String> body) {
        return "Microservice 3 received: " + body.toString();
    }

    @GetMapping("/hello2")
    public String getHello2() {
        return "Hello from Microservice 3";
    }

    @GetMapping("/hello3")
    public String getHello3() {
        return "Hello from Microservice 3";
    }

    @GetMapping("/hello4")
    public String getHello15() {
        return "Hello from Microservice 3";
    }

    @GetMapping("/hello5")
    public String getHello1() {
        return "Hello from Microservice 3";
    }
}
