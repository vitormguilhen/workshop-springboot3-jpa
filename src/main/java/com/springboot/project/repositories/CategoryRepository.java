package com.springboot.project.repositories;

import com.springboot.project.entities.Category;
import com.springboot.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
