package com.george.dev.sftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by George on 16/11/2018
 */

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/page", "/owners/page.html"})
    public String listowners(){
        return "owners/owner-page";
    }
}
