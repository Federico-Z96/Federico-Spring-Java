package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class infoController {
    @GetMapping("/info")
    public ResponseEntity<String> info(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
