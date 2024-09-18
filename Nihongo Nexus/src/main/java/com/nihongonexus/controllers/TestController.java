package com.nihongonexus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("/success")
    public String success (){
        return "Success";
    }


    @GetMapping("/fail")
    public String fail (){
        return "Fail!";
    }

    @GetMapping("/public")
    public String welcome (){
        return "UnProtected Test Welcome Page!";
    }

}
