package com.alingeo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alingeo.domin.Message;
import com.alingeo.repository.MessageRepository;
import com.alingeo.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageRepository messageRepository;



	@Override
	public List<Message> findAll() {
		return messageRepository.findAll();
	}
}
