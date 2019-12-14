package com.sba.adminclient.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOGGER = LogManager.getLogger(TestController.class.getName());

    @GetMapping("/")
    public String test(){
        LOGGER.info("Test controller invoked");
        return "Hello from client application";
    }
}
