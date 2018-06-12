package com.alingeo.service.impl;

import com.alingeo.domin.Center;
import com.alingeo.domin.Teacher;
import com.alingeo.repository.TeacherRepository;
import com.alingeo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository mTeacherRepository;



    @Override
    public Teacher create(Teacher teacher) {
        return mTeacherRepository.save(teacher);
    }



    @Override
    public List<Teacher> findByNameLike(String name) {
        Specification querySpecification = new Specification<Center>() {
            @Override
            public Predicate toPredicate(Root<Center> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (null!=name){
                    predicates.add(cb.like(root.get("name"),name));
                }
                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        return mTeacherRepository.findAll(querySpecification);
    }



    @Override
    public List<Teacher> findAll() {
        return mTeacherRepository.findAll();
    }
}
