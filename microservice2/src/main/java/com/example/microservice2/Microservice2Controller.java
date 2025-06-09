package com.example.microservice2;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/microservice2")
public class Microservice2Controller {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello from Microservice 2";
    }

    @PostMapping("/data")
    public String postData(@RequestBody Map<String, String> body) {
        return "Received: " + body.toString();
    }


}
