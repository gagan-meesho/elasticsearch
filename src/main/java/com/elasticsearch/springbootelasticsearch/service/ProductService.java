package com.elasticsearch.springbootelasticsearch.service;

import com.elasticsearch.springbootelasticsearch.entity.Product;
import com.elasticsearch.springbootelasticsearch.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getProducts(){
        return productRepo.findAll();
    }

    public Product insertProduct(Product product){
        return productRepo.save(product);
    }

}
