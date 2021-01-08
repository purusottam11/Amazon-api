package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.ManageOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ManegeOrderRepository extends JpaRepository<ManageOrder, UUID> {
}
