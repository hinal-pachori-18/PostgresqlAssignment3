package com.example.PostgresqlAssignment2.service.impl;

import com.example.PostgresqlAssignment2.entity.Product;
import com.example.PostgresqlAssignment2.repository.ProductRepo;
import com.example.PostgresqlAssignment2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }
}
