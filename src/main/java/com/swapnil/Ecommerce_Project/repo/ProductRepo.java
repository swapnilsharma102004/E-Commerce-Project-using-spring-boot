package com.swapnil.Ecommerce_Project.repo;

import com.swapnil.Ecommerce_Project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {


}
