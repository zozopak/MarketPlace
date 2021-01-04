package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    @Qualifier("userServiceImp")
    public void set(UserService userService){
        this.userService=userService;
    }


    @GetMapping("/signup")
    public String goRegister(User user){
        return "add-user";
    }
    @PostMapping("/add")
    public String addUser( User user, Model model){


        userService.saveUser(user);
       List<User> users= userService.findAll();
        model.addAttribute("users",users);
        return "redirect:/users";
    }
    @GetMapping("/edit/{id}")
    public  String editUser(@PathVariable long id ,Model model){
        Optional<User> user=userService.getUser(id);
        model.addAttribute("user",user);
        return "update-user";
    }


   @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id,Model model){
        userService.deleteUser(id);
        List<User>users=userService.findAll();
        model.addAttribute("users",users);
        return "redirect:/users";
   }

   @GetMapping
   public String index(Model model){
        List<User> users=userService.findAll();
        model.addAttribute("users",users);
        return "users";
   }
}
