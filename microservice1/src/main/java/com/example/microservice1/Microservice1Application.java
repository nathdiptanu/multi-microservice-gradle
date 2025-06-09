package com.example.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
public class Microservice1Application {
    public Microservice1Application() {
        System.out.println("Application built and constructor executed at " + System.currentTimeMillis());
    }
    public static void main(String[] args) {
        System.out.println("BUILD CHECK >>> Built at: " + System.currentTimeMillis());
        SpringApplication.run(Microservice1Application.class, args);
    }

    @GetMapping("/microservice1/hello")
    public String getHello() {
        System.out.println("Building time: " + System.currentTimeMillis());
        return "Hello from Microservice 1";
    }

    @PostMapping("/microservice1/data")
    public String postData(@RequestBody Map<String, String> body) {
        return "Received: " + body.toString();
    }

    // 🔥 New endpoint to test incremental build performance
    @GetMapping("/microservice1/ping")
    public String ping() {
        return "pong";
    }

    // 🔥 New endpoint to test incremental build performance
    @GetMapping("/microservice1/pingpong")
    public String pingpong() {
        return "pong";
    }
}
