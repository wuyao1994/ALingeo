package com.alingeo.service;

import java.util.List;

import com.alingeo.domin.Center;

public interface CenterService {
	Center create(Center center);

    List<Center> findByCityLike(String city);

	List<Center> findAll();
}
