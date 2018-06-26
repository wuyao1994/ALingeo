package com.alingeo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.alingeo.domin.News;

public interface NewsRepository extends JpaRepository<News, Long>,JpaSpecificationExecutor<News> {
}
