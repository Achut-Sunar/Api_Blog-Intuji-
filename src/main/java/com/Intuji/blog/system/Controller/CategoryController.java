package com.Intuji.blog.system.Controller;

import com.Intuji.blog.system.Entity.Category;
import com.Intuji.blog.system.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save (@RequestBody Category category){
        categoryService.save(category);
        return "Category save successfully";

    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Category> list(){
        return categoryService.findAll();
    }
}
