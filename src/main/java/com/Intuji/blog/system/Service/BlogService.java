package com.Intuji.blog.system.Service;

import com.Intuji.blog.system.Entity.Blog;

import java.util.List;

public interface BlogService {
    void save (Blog blog);
    List<Blog> findAll();
    Blog findById(int id);
    void delete ( Integer id);
}
