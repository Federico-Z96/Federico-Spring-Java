package com.example.springboot.es1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class infoController {
    @GetMapping("/info")
    public ResponseEntity<String> info(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
