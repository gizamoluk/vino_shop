package com.mysite.service;

import com.mysite.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {
    List<Product> getAllProduct();

    Product getProductById(long id);
}
