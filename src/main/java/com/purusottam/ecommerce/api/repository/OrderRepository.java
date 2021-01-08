package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
