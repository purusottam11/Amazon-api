package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.RawProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawProductRepository extends JpaRepository<RawProducts, String> {

    RawProducts findByBrand(String brand);

}
