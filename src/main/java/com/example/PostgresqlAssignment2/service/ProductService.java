package com.example.PostgresqlAssignment2.service;

import com.example.PostgresqlAssignment2.entity.Product;

import java.util.List;

public interface ProductService {
    public Product addProduct(Product product);

    public List<Product> getAllProducts();

    public void deleteProduct(int id);
}
