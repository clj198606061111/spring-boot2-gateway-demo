package com.itclj.server1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s1")
public class S1Controller {

    @GetMapping("/a")
    public String s1(){
        return "s1";
    }

}
