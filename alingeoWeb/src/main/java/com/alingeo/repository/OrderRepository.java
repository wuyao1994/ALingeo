package com.alingeo.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.alingeo.domin.Order;

public interface OrderRepository extends JpaRepository<Order, Long>,JpaSpecificationExecutor<Order> {
    List<Order> findAll(Specification<Order> spec);
}
