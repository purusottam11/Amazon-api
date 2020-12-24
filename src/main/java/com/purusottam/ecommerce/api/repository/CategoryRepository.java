package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
