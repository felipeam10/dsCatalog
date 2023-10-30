package com.felipe.dsCatalog.tests;

import com.felipe.dsCatalog.dto.ProductDTO;
import com.felipe.dsCatalog.entities.Category;
import com.felipe.dsCatalog.entities.Product;

import java.time.Instant;

public class Factory {

    public static Product createdProduct() {
        Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-07-13T20:50:07.12345Z"));
        product.getCategories().add(new Category(2L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = createdProduct();
        return new ProductDTO(product, product.getCategories());
    }
}
