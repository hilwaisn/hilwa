package com.tugas4.hilwa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.tugas4.hilwa.models.Food;
import com.tugas4.hilwa.services.FoodService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class FoodController {
   @Autowired
   private FoodService foodService;

   @GetMapping("/food")
   public String listFoods(Model model) {
      List<Food> foods = foodService.getAllProducts();
      model.addAttribute("food", foods);
      return "food";
   }
}