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

import com.alingeo.domin.News;
import com.alingeo.domin.Order;
import com.alingeo.repository.OrderRepository;
import com.alingeo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order create(Order join) {
		return orderRepository.save(join);
	}

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public void deleteOrderById(Long id) {
		orderRepository.deleteById(id);
	}

	@Override
	public Order findByOrderNumber(String id) {
		Specification querySpecification = new Specification<News>() {
			@Override
			public Predicate toPredicate(Root<News> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<>();
				if (null != id) {
					predicates.add(cb.equal(root.get("orderNumber"), id));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		return (Order) orderRepository.findOne(querySpecification).get();
	}
}
