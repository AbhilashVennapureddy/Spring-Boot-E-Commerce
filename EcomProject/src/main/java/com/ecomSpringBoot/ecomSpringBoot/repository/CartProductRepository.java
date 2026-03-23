package com.ecomSpringBoot.ecomSpringBoot.repository;

import com.ecomSpringBoot.ecomSpringBoot.models.CartProduct;
import com.ecomSpringBoot.ecomSpringBoot.models.CartProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartProductRepository extends JpaRepository<CartProduct, CartProductId> {
}
