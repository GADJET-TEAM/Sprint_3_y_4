package com.GADJET.Sprint_3_4.frontControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class frontIndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
