package com.Intuji.blog.system.Service;

import com.Intuji.blog.system.Entity.Blog;
import com.Intuji.blog.system.Repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepo blogRepo;

    @Override
    public void save(Blog blog) {
        Blog entity;
        if(blog.getId()== null){
            entity = new Blog();
        }else{
            entity = this.findById(blog.getId());
        }
        entity.setTitle(blog.getTitle());
        entity.setDescription(blog.getDescription());
        entity.setCategory(blog.getCategory());

        blogRepo.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepo.findAll();
    }

    @Override
    public Blog findById(int id) {
        Optional<Blog> optionalBlog = blogRepo.findById(id);
        if(optionalBlog.isEmpty()){
            throw new RuntimeException("Blog not found:" +id);
        }

        return optionalBlog.get();
    }

    @Override
    public void delete(Integer id) {
        blogRepo.deleteById(id);

    }
}
