package com.example.simplejavaapi.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @CrossOrigin("*")
    @GetMapping
    public Map<String, String> index(){
         Map<String, String> map = new HashMap<>();
         map.put("Github", "https://github.com/chuttmateo");
         map.put("Documentation", "http://localhost:8080/simple-java-api.html");
         return map;
    }
}
