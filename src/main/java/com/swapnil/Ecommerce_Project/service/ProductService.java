package com.swapnil.Ecommerce_Project.service;

import com.swapnil.Ecommerce_Project.model.Product;
import com.swapnil.Ecommerce_Project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProduct() {

        return repo.findAll();

    }
}
