package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
