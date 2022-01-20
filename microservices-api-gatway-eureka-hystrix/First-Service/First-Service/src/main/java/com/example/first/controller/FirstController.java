package com.example.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/first")
public class FirstController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String get(){
        return "Welcome in First service";
    }

    @GetMapping("/data")
    public List<String> getData(){
        List<String> list= restTemplate.getForObject("http://SECOND-SERVICE/second/data",List.class);
        return list;
    }
}
