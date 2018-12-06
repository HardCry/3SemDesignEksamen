package com.example.demo.controller;

import com.example.demo.model.FoodItemModel;
import com.example.demo.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodItem")
public class FoodItemController {

    @Autowired
    FoodItemService foodItemService;

    @GetMapping (value = "/")
    public String homePage(){
        return "index";
    }

    @GetMapping (value = "/create")
    public String create(Model model){
        model.addAttribute("foodItemModel", new FoodItemModel());
        return "fooditem/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute FoodItemModel foodItemModel){
        foodItemService.save(foodItemModel);
        return "redirect:/fooditem/";
    }
}
