package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReview,Long> {
    
}
