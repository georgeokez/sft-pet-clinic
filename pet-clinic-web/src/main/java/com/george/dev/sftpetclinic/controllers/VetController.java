package com.george.dev.sftpetclinic.controllers;

import com.george.dev.data.services.VetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class VetController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index", "/vets/index.html"})
    public String listVets(Model model){
        logger.info("Calling list of Vets page");

        model.addAttribute("vets", vetService.findAll());
        return "vets/vets-index";
    }

    public void processVetData(){

    }
}
