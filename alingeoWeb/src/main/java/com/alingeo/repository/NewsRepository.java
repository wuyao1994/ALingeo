package com.alingeo.repository;

import com.alingeo.domin.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long>{
}
