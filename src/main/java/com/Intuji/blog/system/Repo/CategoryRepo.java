package com.Intuji.blog.system.Repo;

import com.Intuji.blog.system.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
