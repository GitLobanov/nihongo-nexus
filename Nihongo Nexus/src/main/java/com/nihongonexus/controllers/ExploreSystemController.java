package com.nihongonexus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/system")
public class ExploreSystemController {

    @GetMapping()
    public String exploreSystem() {
        return "explore_system";
    }

}
