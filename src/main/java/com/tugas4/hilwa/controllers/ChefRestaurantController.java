package com.tugas4.hilwa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tugas4.hilwa.models.ChefRestaurant;
import com.tugas4.hilwa.services.ChefRestaurantService;

@Controller
public class ChefRestaurantController {

    @Autowired
    private ChefRestaurantService chefRestaurantService;

    @GetMapping("/chef-restaurant")
    public String listChefRestaurant(Model model) {
        List<ChefRestaurant> chefRestaurants = chefRestaurantService.getAllChefRestaurants();
        model.addAttribute("chefRestaurants", chefRestaurants);
        return "chef-restaurant";
    }
}