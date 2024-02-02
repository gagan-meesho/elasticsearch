package com.elasticsearch.springbootelasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "products")
public class Product {
    private String name;
    private int id;
}
