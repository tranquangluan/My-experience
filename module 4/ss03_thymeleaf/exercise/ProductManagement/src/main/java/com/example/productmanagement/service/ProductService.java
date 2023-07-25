package com.example.productmanagement.service;

import com.example.productmanagement.bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    List<Product> finAll();
    void add(Product product);
    void update(Product product);
    void delete(Integer id);
    Product findById(Integer id);
    Product findByName(String product_name);


}
