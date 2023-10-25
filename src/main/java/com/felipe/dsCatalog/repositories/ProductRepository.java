package com.felipe.dsCatalog.repositories;

import com.felipe.dsCatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
