package com.george.dev.sftpetclinic.controllers;

import com.george.dev.data.services.OwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class OwnerController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/page", "/owners/page.html"})
    public String listowners(Model model){
        logger.info("Calling list of Owners page");

        model.addAttribute("owners", ownerService.findAll());

        return "owners/owner-page";
    }
}
