package com.example.PostgresqlAssignment2.controller;

import com.example.PostgresqlAssignment2.entity.Product;
import com.example.PostgresqlAssignment2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return product;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Successfully deleted";
    }
}
