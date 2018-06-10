package com.alingeo.service;

import java.util.List;

import com.alingeo.domin.News;

public interface NewsService {
	News createNews(News news);



	News udpateNews(News news);



	void deleteNewsById(Long id);



	News findNewsById(Long id);



	List<News> findAll();
}
