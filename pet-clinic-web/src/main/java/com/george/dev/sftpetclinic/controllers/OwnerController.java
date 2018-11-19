package com.george.dev.sftpetclinic.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class OwnerController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping({"/owners","/owners/page", "/owners/page.html"})
    public String listowners(){
        logger.info("Calling list of Owners page");
        return "owners/owner-page";
    }
}
