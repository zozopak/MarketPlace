package org.example.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@ComponentScan(basePackages = "org.example.controllers")
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String getIndex(@RequestBody(required =false) String body, ModelMap modelMap){
      modelMap.addAttribute("greeting","Hello to every one!!!!");
      modelMap.addAttribute("body",body);
        return "index";
    }
}
