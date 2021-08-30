package com.example.demo.repo;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;


@RepositoryRestResource
 public interface ProductRepository extends JpaRepository<Product, Integer> {

    Page<Product> findProductByCategory_Id(@RequestParam("id") int id, Pageable pageable);
    Page<Product>  findProductsByNameContaining(@RequestParam("name") String name, Pageable pageable);
    Page<Product>  findProductById(@RequestParam("id") int id,Pageable pageable);

}
