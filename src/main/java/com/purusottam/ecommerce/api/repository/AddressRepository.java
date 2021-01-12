package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepository extends JpaRepository<Address, Long> {
}
