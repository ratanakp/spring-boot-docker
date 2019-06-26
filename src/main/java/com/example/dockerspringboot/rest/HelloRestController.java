package com.example.dockerspringboot.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloRestController {


    @GetMapping("/hello")
    public ResponseEntity<String> helloRest() {
        return ResponseEntity.ok("Hello world with docker!");
    }

}
