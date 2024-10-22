package com.tugas4.hilwa.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tugas4.hilwa.models.Food;

@Service
public class FoodService {
 public List<Food> getAllProducts() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food(1, "Chicken steak", 23000L, "sedang"));
        foods.add(new Food(2, "Kentang goreng", 19000L, "besar"));
        foods.add(new Food(3, "Ayam geprek", 25000L, "kecil"));
        foods.add(new Food(4, "Nasi goreng", 24000L, "sedang"));
        return foods;
    }   
}
