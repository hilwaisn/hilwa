package com.tugas4.hilwa.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tugas4.hilwa.models.Chef;

@Service

public class ChefServices {
    public List<Chef> getAllProducts() {
        List<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1, "Hilwa","Semarang"));
        chefs.add(new Chef(2, "Riri", "Banjar"));
        chefs.add(new Chef(3, "Tisa", "Banjar"));
        chefs.add(new Chef(4, "Siti", "KBB"));
        return chefs;
    }
}
