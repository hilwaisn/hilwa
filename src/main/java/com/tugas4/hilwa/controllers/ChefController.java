package com.tugas4.hilwa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tugas4.hilwa.models.Chef;
import com.tugas4.hilwa.services.ChefServices;

@Controller
public class ChefController {
    @Autowired
    private ChefServices chefServices;

    @GetMapping("/chef")
    public String listChef(Model model) {
        List<Chef> chefs = chefServices.getAllProducts();
        model.addAttribute("chefs", chefs);
        return "chef";
    }
}
