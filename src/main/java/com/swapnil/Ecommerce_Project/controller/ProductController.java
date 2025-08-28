package com.swapnil.Ecommerce_Project.controller;


import com.swapnil.Ecommerce_Project.model.Product;
import com.swapnil.Ecommerce_Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;

        @GetMapping("/product")
        public ResponseEntity<List<Product>> getAllProduct(){
            return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);

        }

        @GetMapping("/product/{id}")
        public ResponseEntity<Product> getProduct(@PathVariable int id){
            Product product=service.getProductById(id);

            if(product!=null)
                return new ResponseEntity<>(product,HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);



        }



}
