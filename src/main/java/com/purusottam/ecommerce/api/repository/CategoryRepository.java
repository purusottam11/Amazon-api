package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(String name);

    Optional<Category> findByParentId(Long parentId);

}
