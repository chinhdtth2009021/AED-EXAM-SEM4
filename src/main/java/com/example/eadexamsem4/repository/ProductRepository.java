package com.example.eadexamsem4.repository;

import com.example.eadexamsem4.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}