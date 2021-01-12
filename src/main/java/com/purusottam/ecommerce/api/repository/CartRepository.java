package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Long> {
}
