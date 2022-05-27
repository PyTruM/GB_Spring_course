package com.tsyplakov.gb_spring_boot.web.repositories;

import com.tsyplakov.gb_spring_boot.web.entity.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(List.of(
                new Product(1L,"Apple", 85),
                new Product(2L, "Orange", 105),
                new Product(3L, "Pineapple", 200),
                new Product(4L, "Strawberry", 160)
        ));
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product findById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }


}
