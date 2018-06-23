package com.alingeo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alingeo.domin.News;
import com.alingeo.repository.NewsRepository;
import com.alingeo.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsRepository newsRepository;



	@Override
	public News createNews(News news) {
		return newsRepository.save(news);
	}



	@Override
	public News udpateNews(News news) {
		return newsRepository.save(news);
	}



	@Override
	public void deleteNewsById(Long id) {
		newsRepository.deleteById(id);
	}



	@Override
	public List<News> findAll() {
		return newsRepository.findAll();
	}



	@Override
	public News findNewsById(Long id) {
		return newsRepository.findById(id).get();
	}
}
