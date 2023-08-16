package com.deep.product.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.deep.product.Model.Product;
import com.deep.product.Repository.ProductRepo;

@Component
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
                                                                  

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductByName(String name) {
        return repo.findByName(name);
    }

    public void add(Product p) {
        repo.save(p);
    }

    public void update(Product p) {
        repo.save(p);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

}

