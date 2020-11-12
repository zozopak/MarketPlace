package com.mapsa.controllers;



import com.mapsa.modells.Person;
import com.mapsa.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
   @Autowired
  public IndexService indexService;

    @RequestMapping("/")
     public String getIndex(){

         return "index";
     }
     @RequestMapping("/users")
     public String getUsers(Model model){
        IndexService indexService=new IndexService();
       List<Person>users=indexService.getPersons();

     model.addAttribute("users",users);

        return "persons";
     }
}
