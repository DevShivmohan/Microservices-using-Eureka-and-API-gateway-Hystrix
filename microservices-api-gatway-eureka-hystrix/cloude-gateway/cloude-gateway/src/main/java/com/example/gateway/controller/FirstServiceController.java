package com.example.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class FirstServiceController {

    @GetMapping("/test")
    public String get(){
        return "Welcome in Cloude gateway";
    }

    /**
     * return response when this service server down
     * @return
     */
    @GetMapping("/fallBackFirstService")
    public String fallBackFirstService(){
        return "First service down time !!";
    }

    /**
     * return response when this service server down
     * @return
     */
    @GetMapping("/fallBackSecondService")
    public String fallBackSecondService(){
        return "Second service down time !!";
    }
}
