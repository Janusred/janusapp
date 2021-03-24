package com.janus.janusapp.web.controller;

import com.janus.janusapp.domain.Product;
import com.janus.janusapp.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
     @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    public Optional<List<Product>> getProduct(int categoryId){
        return productService.getByCategory(categoryId);
    }
    public Product save (Product product){
        return productService.save(product);
    }
    public boolean delete(int productId){
        return productService.delete(productId);
    }
}
