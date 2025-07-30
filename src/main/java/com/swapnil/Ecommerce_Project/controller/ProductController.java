package com.swapnil.Ecommerce_Project.controller;


import com.swapnil.Ecommerce_Project.model.Product;
import com.swapnil.Ecommerce_Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;


        @RequestMapping("/")
        public String greet(){
            return "Hellow!! People";
        }


        @GetMapping("/product")
        public List<Product> getAllProduct(){
            return service.getAllProduct();

        }
}
