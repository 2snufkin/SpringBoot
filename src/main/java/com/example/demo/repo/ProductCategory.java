package com.example.demo.repo;

import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
  public interface ProductCategory extends JpaRepository<Category,Integer> {

}
