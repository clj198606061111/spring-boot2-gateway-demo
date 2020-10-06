package com.itclj.server2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s2")
public class S2Controller {

    @GetMapping("/b")
    public String s2() {
        return "s2";
    }
}
