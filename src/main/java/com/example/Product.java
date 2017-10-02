package com.example;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "products")
@Entity
public class Product {

    @Id
    private Long id;
    private String name;

    // JPA
    public Product() {
    }
}
