package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.ManageOrder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ManegeOrderRepository extends JpaRepository<ManageOrder, Long> {
}
