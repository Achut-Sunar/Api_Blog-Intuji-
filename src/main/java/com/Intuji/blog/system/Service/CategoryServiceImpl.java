package com.Intuji.blog.system.Service;

import com.Intuji.blog.system.Entity.Category;
import com.Intuji.blog.system.Repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    @Override
    public void save(Category category) {
        Category entity;
        if(category.getId()== null){
            entity = new Category();
        }else{
            entity = this.findById(category.getId());
        }
        entity.setName(category.getName());

        categoryRepo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(int id) {
        Optional<Category> optionalCategory = categoryRepo.findById(id);
        if(optionalCategory.isEmpty()){
            throw new RuntimeException("Category not found:" +id);
        }

        return optionalCategory.get();
    }

    @Override
    public void delete(Integer id) {
        categoryRepo.deleteById(id);

    }
}
