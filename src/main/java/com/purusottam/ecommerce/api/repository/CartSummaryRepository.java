package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.CartSummary;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartSummaryRepository extends JpaRepository<CartSummary, Long> {
}
