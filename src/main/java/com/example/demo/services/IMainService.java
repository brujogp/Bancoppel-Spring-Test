package com.example.demo.services;

import com.example.demo.dto.ProductEntity;

import java.util.Optional;

public interface IMainService {
    Optional<ProductEntity> getProductById(Long id);

    boolean saveProductById(ProductEntity product);
}
