package com.purusottam.ecommerce.api.repository;

import com.purusottam.ecommerce.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
