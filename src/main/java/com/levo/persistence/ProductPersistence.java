package com.levo.persistence;

import com.levo.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPersistence extends JpaRepository<Product, Long> {
}
