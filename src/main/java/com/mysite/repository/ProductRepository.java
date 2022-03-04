package com.mysite.repository;

import com.mysite.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {
    @Query( nativeQuery = true,value = "SELECT * FROM product ORDER BY random() LIMIT 4")
    public List<Product> get4ByRandom();

    public List<Product> getAllByOrderByIdAsc();


}
