package com.Intuji.blog.system.Repo;

import com.Intuji.blog.system.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog, Integer> {
}
