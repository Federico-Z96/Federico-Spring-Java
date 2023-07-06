package com.example.springboot.Es5CRUD.Controller;

import com.example.springboot.Es5CRUD.Entity.Ingredient;
import com.example.springboot.Es5CRUD.Repository.RepositoryIngrediente;
import com.example.springboot.Es5CRUD.Service.ServiceIngredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ingredient")
public class ControllerIngredients {
    @Autowired
    private ServiceIngredient serviceIngredtient;
    @Autowired
    private RepositoryIngrediente repositoryIngrediente;

    @PostMapping("/createIngredient")
    public ResponseEntity<?> createIngredient(@RequestBody Ingredient ingredient){
        return serviceIngredtient.createingredient(ingredient);
    }



}
