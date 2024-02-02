package com.elasticsearch.springbootelasticsearch.controller;

import com.elasticsearch.springbootelasticsearch.entity.Product;
import com.elasticsearch.springbootelasticsearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/findall")
    public Iterable<Product> findAll(){
        return productService.getProducts();
    }

}
