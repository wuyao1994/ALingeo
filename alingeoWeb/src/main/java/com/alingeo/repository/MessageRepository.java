package com.alingeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alingeo.domin.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

}
