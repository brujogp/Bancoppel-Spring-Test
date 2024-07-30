package com.example.demo.controllers;

import com.example.demo.services.MainServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
   MainServiceImpl service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable("id") Long productId){
       return ResponseEntity.ok(service.getProductById(productId));
    }
}
