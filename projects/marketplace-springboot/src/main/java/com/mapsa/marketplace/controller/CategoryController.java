package com.mapsa.marketplace.controller;

import com.mapsa.marketplace.model.Category;
import com.mapsa.marketplace.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {


    private CategoryRepository categoryRepository;
     @Autowired
     public CategoryController(CategoryRepository categoryRepository){
         this.categoryRepository=categoryRepository;
     }

    @GetMapping
    public String index(Model model){
        List<Category> list=categoryRepository.findAll();
       model.addAttribute("list",list);
        return "category";
    }

    @PostMapping("/add")
    public String add( Category category,Model model){
         categoryRepository.save(category);
         List<Category> list=categoryRepository.findAll();
         model.addAttribute("list",list);
         return "redirect:/category";
    }
    @GetMapping("/register")
    public String goRegister(Category category){
        return "add-category";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id,Model model){
       categoryRepository.deleteById(id);
        List<Category> list=categoryRepository.findAll();
        model.addAttribute("list",list);
        return "redirect:/category";
    }


}
