package com.nihongonexus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/galaxy")
public class GalaxyController {

    @GetMapping
    public String galaxy () {
        return "galaxy";
    }



}
