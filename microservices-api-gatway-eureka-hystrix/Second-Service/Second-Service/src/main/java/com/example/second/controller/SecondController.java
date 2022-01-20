package com.example.second.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/test")
    public String get(){
        return "Welcome in Second service";
    }

    @GetMapping("/data")
    public List<String> getData(){
        List<String> list=new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add("Shiv"+i);
        return list;
    }
}
