package com.Intuji.blog.system.Service;


import com.Intuji.blog.system.Entity.Category;

import java.util.List;

public interface CategoryService {
    void save (Category category);
    List<Category> findAll();
    Category findById(int id);
    void delete ( Integer id);
}
