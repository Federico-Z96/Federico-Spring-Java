package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

public class randomController {
    @GetMapping("/rabdom")
    public ResponseEntity<String> random(){
        boolean randomKey = new Random().nextBoolean();


        if (randomKey) {
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return ResponseEntity.badRequest().build();
            // return ResponseEntity.Status(HttpStatus.BAD_REQUEST).body("400 - Richiesta non valida");
        }
    }
}
