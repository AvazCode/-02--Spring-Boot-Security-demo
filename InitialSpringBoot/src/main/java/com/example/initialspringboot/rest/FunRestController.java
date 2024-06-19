package com.example.initialspringboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name: InitialSpringBoot
 * Author: AvaZ
 * Data: 4/16/2024
 * Time: 1:38 PM
 **/
@RestController
public class FunRestController {

    @GetMapping(path = "/")
    public String greeting(){
        return "Hello World !";
    }

    @GetMapping("/fortune")
    public String GetDailyFortune(){
        return "Today is your lucky day!";
    }

}
