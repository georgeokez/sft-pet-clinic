package com.george.dev.sftpetclinic.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class VetController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @RequestMapping({"/vets","/vets/index", "/vets/index.html"})
    public String listVets(){
        logger.info("Calling list of Vets page");
        return "vets/vets-index";
    }

    public void processVetData(){

    }
}
