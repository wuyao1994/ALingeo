package com.alingeo.repository;

import com.alingeo.domin.Center;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CenterRepository extends JpaRepository<Center, Long>,JpaSpecificationExecutor<Center> {
    List<Center> findAll(Specification<Center> spec);
}
