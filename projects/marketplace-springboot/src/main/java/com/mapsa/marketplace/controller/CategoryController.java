package com.mapsa.marketplace.controller;

import com.mapsa.marketplace.model.Category;
import com.mapsa.marketplace.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        List<Category> lists=categoryRepository.findAll();
       model.addAttribute("all",lists);
        return "category";
    }

    @PostMapping("/add")
    public String add( Category category,Model model){
         categoryRepository.save(category);
         List<Category> lists=categoryRepository.findAll();
         model.addAttribute("all",lists);
         return "redirect:/category";
    }
    @GetMapping("/register")
    public String goRegister(Category category){
        return "add-category";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id,Model model){
       categoryRepository.deleteById(id);
        List<Category> lists=categoryRepository.findAll();
        model.addAttribute("all",lists);
        return "redirect:/category";
    }
 @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id,Model model){
        Category category= categoryRepository.findById(id);
        model.addAttribute("category",category);
         return "edit-category";

    }
    @PostMapping("/update/{id}")
    public String update(@PathVariable long id ,Category category){
         categoryRepository.save(category);
         return "redirect:/category";

    }


}
