package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferCategory extends JpaRepository<Offer, Long> {
}
