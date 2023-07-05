package com.example.springboot.Es5CRUD.Controller;

import com.example.springboot.Es5CRUD.Entity.Ingredient;
import com.example.springboot.Es5CRUD.Service.ServiceIngredtient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ingredient")
public class ControllerIngredients {
    @Autowired
    private ServiceIngredtient serviceIngredtient;

    @PostMapping("/createIngredient")
    public ResponseEntity<?> createIngredient(@RequestBody Ingredient ingredient){
        return serviceIngredtient.createingredient(ingredient);
    }


}
