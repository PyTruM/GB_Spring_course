package com.tsyplakov.gb_spring_boot.web.controllers;

import com.tsyplakov.gb_spring_boot.web.entity.Product;

import com.tsyplakov.gb_spring_boot.web.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> products() {
        return productService.getAllProduct();
    }
}
