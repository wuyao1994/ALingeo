package com.alingeo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
