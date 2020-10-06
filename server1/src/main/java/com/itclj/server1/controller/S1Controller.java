package com.itclj.server1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/s1")
public class S1Controller {

    private Logger logger = LoggerFactory.getLogger(S1Controller.class);

    @GetMapping("/a")
    public String s1() {
        logger.info("S1 request time={}", System.currentTimeMillis());
        return "s1=" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
