package com.deep.product.Controller;

import com.deep.product.Model.Product;
import com.deep.product.Service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> products() {

        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product geProduct(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PostMapping("/product")
    public void addProject(@RequestBody Product p) {
        service.add(p);
    }

    @PutMapping("/product/{id}")
    public void UpdateProduct(@PathVariable int id, @RequestBody Product p) {
        p.setId(id);
        service.update(p);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
       service.delete(id);
    }

    //want to add new feature
}
