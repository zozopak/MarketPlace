package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
    @GetMapping(value = "/get-name")
    public String getName(){
        return "get-name";
    }
    @PostMapping("/show-name")
    public String showName(ModelMap model, Person person, @RequestBody String s){
       model.addAttribute("body",s);
       model.addAttribute("person",person);
        return "show-name";
    }
}
