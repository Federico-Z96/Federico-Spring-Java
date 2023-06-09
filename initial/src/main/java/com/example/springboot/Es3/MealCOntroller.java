package com.example.springboot.Es3;

import com.example.springboot.Es2.Meal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealCOntroller {
    private static List<Meal> piatti = new ArrayList<Meal>();
    @PostMapping("/meal")
    public ResponseEntity <?> AddMeal(@RequestBody Meal newMeal) {
        piatti.add(newMeal);
        return new ResponseEntity <String>("aggiunta piatto", HttpStatus.OK);
    }

}
