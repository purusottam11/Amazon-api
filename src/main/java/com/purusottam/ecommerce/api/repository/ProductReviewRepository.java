package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductReviewRepository extends JpaRepository<ProductReview, UUID> {
    
}
