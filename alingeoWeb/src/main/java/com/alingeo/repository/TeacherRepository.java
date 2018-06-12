package com.alingeo.repository;

import com.alingeo.domin.Teacher;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long>,JpaSpecificationExecutor<Teacher> {
    List<Teacher> findAll(Specification<Teacher> spec);
}
