package com.example.springboot.Es2;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class restController {
    @GetMapping("/meals")
        public List <Meal> getMeals(){
            List<Meal> listMeal = new ArrayList<>();
                              //   = Arrays.asList(new meal );
            listMeal.add(new Meal("Pasta Carbonara","piatto tipico Romano", 12.50));
            listMeal.add(new Meal("Pizza","piatto tipico Napoletano",14.60));
            listMeal.add(new Meal("Lasagne","piatto tipico Bolognese",13.20));
            return listMeal;
        }
    }

