package com.example.demo.controllers;

import com.example.demo.dto.ProductEntity;
import com.example.demo.services.IMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    final IMainService service;

    public MainController(IMainService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable("id") Long productId) {
        var product = service.getProductById(productId);

        if (product.isPresent()) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> saveNewProduct(@RequestBody ProductEntity product) {
        service.saveProductById(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
