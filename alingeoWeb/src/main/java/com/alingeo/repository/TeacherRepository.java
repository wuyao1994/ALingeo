package com.alingeo.repository;

import com.alingeo.domin.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alingeo.domin.Center;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
