package com.ryanair.ryr_wars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    String indexOf(){
        return "index";
    }
}
