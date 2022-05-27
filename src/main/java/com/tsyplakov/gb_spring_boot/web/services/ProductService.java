package com.tsyplakov.gb_spring_boot.web.services;

import com.tsyplakov.gb_spring_boot.web.entity.Product;
import com.tsyplakov.gb_spring_boot.web.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return productRepository.getProducts();
    }
}
