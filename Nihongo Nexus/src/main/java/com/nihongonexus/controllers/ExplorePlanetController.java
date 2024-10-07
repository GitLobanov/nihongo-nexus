package com.nihongonexus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/explore")
@Controller
public class ExplorePlanetController {

    @GetMapping
    public String explore () {
        return "planet";
    }

}
