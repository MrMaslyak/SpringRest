package com.maslyak.practicRest.repository;

import com.maslyak.practicRest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
