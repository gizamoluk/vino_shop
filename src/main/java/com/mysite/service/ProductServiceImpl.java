package com.mysite.service;

import com.mysite.model.Product;
import com.mysite.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }


    @Override
    public Product getProductById(long id) {
        Optional < Product > optional = productRepository.findById(id);
        Product item = null;
        if (optional.isPresent()) {
            item = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return item;
    }

}
