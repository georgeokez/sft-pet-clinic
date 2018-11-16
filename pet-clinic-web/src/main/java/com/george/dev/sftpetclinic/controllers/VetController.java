package com.george.dev.sftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/vets-index";
    }
}
