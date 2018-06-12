package com.alingeo.service;

import java.util.List;

import com.alingeo.domin.Teacher;

public interface TeacherService {
	Teacher create(Teacher teacher);

    List<Teacher> findByNameLike(String name);

	List<Teacher> findAll();
}
