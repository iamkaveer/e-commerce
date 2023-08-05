package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    //get all product
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    //add
    public void addProduct(Product product){
        productRepository.save(product);
    }

    //delete
    public void deleteProductById(long id){
        productRepository.deleteById(id);
    }

    //get
    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }

    //
    public List<Product> getAllProductsByCategoryId(int id){
        return productRepository.findAllByCategoryId(id);
    }


}
