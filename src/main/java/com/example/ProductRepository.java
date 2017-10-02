package com.example;

import org.springframework.data.repository.Repository;

import java.util.stream.Stream;

public interface ProductRepository extends Repository<Product, Long> {

    Stream<Product> findAll();

}
