package com.ecommerce.service;

import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    //save
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    //get all
    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    //delete by id
    public void deleteById(int id) {
        categoryRepository.deleteById(id);
    }

    public Optional<Category> getCatById(int id){
        return categoryRepository.findById(id);
    }
}
