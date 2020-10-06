package com.itclj.server2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/s2")
public class S2Controller {

    private Logger logger = LoggerFactory.getLogger(S2Controller.class);

    @GetMapping("/b")
    public String s2() {
        logger.info("S2 request time={}", System.currentTimeMillis());
        return "s2=" + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
