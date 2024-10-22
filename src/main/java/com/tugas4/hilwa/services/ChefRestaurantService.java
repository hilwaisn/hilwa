package com.tugas4.hilwa.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tugas4.hilwa.models.Chef;
import com.tugas4.hilwa.models.ChefRestaurant;
import com.tugas4.hilwa.models.Food;

@Service
public class ChefRestaurantService {

    @Autowired
    private ChefServices chefServices;

    @Autowired
    private FoodService foodService;

    public List<ChefRestaurant> getAllChefRestaurants() {
        List<ChefRestaurant> chefRestaurants = new ArrayList<>();
        List<Chef> chefs = chefServices.getAllProducts();
        List<Food> foods = foodService.getAllProducts();

        for (Food food : foods) {
            for (Chef chef : chefs) {
                if (food.getId() == chef.getId()) {
                    chefRestaurants.add(new ChefRestaurant(food, chef));
                }
            }
        }
        return chefRestaurants;
    }
}