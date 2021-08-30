package com.example.demo.repo;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrdersRepository extends JpaRepository<Order, Integer> {
    Page<Order> findOrdersByCustomerEmailOrderByDateCreatedDesc(@Param("email") String email,  Pageable pageable);
}
