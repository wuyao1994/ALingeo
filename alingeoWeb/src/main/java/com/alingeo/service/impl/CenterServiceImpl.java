package com.alingeo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.alingeo.domin.Center;
import com.alingeo.repository.CenterRepository;
import com.alingeo.service.CenterService;

@Service
public class CenterServiceImpl implements CenterService {
	@Autowired
	private CenterRepository centerRepository;



	@Override
	public Center create(Center center) {
		return centerRepository.save(center);
	}



	@Override
	public List<Center> findByCityLike(String city) {
		Specification querySpecification = new Specification<Center>() {
			@Override
			public Predicate toPredicate(Root<Center> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<>();
				if (null != city) {
					predicates.add(cb.like(root.get("city"), city));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		return centerRepository.findAll(querySpecification);
	}



	@Override
	public List<Center> findAll() {
		return centerRepository.findAll();
	}



	@Override
	public void deleteCenterById(Long id) {
		centerRepository.deleteById(id);
	}
}
