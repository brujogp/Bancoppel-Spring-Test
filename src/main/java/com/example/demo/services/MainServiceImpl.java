package com.example.demo.services;

import com.example.demo.dto.ProductEntity;
import com.example.demo.exceptions.NotFoundException;
import com.example.demo.reposities.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainServiceImpl implements IMainService {
    ProductRepository repository;

    public MainServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductEntity getProductById(Long id) throws NotFoundException {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("No se encontró el producto con el ID ".concat(id.toString())));
    }

    @Override
    @Transactional
    public boolean saveProductById(ProductEntity product) {
        repository.save(product);
        return true;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return (List<ProductEntity>) repository.findAll();
    }


}
