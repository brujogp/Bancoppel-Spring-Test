package com.example.demo.services;

import com.example.demo.dto.ProductEntity;

public interface IMainService {
    ProductEntity getProductById(Long id);

    boolean saveProductById(ProductEntity product);
}
