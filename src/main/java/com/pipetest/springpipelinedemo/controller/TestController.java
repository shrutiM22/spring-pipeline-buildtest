package com.pipetest.springpipelinedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testtest")
    public String getMessage(){
        return "lets not take your test!";
    }

}
