package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.RawProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawProductRepository extends JpaRepository<RawProduct, String> {

    RawProduct findByBrand(String brand);

}
