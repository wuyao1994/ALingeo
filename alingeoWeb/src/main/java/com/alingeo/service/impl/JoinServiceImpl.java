package com.alingeo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alingeo.domin.Join;
import com.alingeo.repository.JoinRepository;
import com.alingeo.service.JoinService;

@Service
public class JoinServiceImpl implements JoinService {
	@Autowired
	private JoinRepository joinRepository;



	@Override
	public Join create(Join join) {
		return joinRepository.save(join);
	}



	@Override
	public List<Join> findAll() {
		return joinRepository.findAll();
	}
}
