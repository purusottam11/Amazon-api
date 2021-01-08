package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OfferCategory extends JpaRepository<Offer, UUID> {
}
