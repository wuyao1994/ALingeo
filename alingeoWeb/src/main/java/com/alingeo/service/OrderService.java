package com.alingeo.service;

import java.util.List;

import com.alingeo.domin.Join;
import com.alingeo.domin.Order;

public interface OrderService {
	Order create(Order join);



	List<Order> findAll();

	void deleteOrderById(Long id);

	Order findByOrderNumber(String id);
}
