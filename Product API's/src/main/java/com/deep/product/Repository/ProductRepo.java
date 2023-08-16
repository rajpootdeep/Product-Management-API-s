package com.deep.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.product.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    Product findByName(String name);
    
}
