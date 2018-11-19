package com.george.dev.sftpetclinic.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping({"","/","index", "index.html"})
    public String index(){
        logger.info("Calling index.html");
        return "index";
    }
}
