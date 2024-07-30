package com.example.demo.services;


import com.example.demo.dto.ProductEntity;
import com.example.demo.reposities.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MainServiceImpl implements IMainService {
    ProductRepository repository;

    public MainServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<ProductEntity> getProductById(Long id) {
        return repository.findById(id);
    }
}
