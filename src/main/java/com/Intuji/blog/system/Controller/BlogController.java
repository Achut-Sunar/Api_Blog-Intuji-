package com.Intuji.blog.system.Controller;


import com.Intuji.blog.system.Entity.Blog;
import com.Intuji.blog.system.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save (@RequestBody Blog blog){
        blogService.save(blog);
        return "Blog save successfully";

    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Blog> list(){
        return blogService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Blog get(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        return blog;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id")int id){
        blogService.delete(id);
        return "Blog delete successfully";
    }

}
