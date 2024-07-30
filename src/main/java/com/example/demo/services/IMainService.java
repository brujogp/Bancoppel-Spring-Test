package com.example.demo.services;

import com.example.demo.dto.ProductEntity;

import java.util.List;

public interface IMainService {
    ProductEntity getProductById(Long id);

    boolean saveProductById(ProductEntity product);

    List<ProductEntity> getAllProducts();
}
