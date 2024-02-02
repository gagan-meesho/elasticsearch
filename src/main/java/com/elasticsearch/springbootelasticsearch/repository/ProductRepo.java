package com.elasticsearch.springbootelasticsearch.repository;

import com.elasticsearch.springbootelasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
    // You can add custom query methods here if needed
}

