package com.alingeo.service;

import java.util.List;

import com.alingeo.domin.Join;

public interface JoinService {
	Join create(Join join);



	List<Join> findAll();
}
