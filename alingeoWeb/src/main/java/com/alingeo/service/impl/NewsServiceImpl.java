package com.alingeo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.alingeo.domin.News;
import com.alingeo.repository.NewsRepository;
import com.alingeo.service.NewsService;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		return newsRepository.findAll(sort);
	}



	@Override
	public News findNewsById(Long id) {
		return newsRepository.findById(id).get();
	}

	@Override
	public List<News> findNewsByType(String type) {
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		Specification querySpecification = new Specification<News>() {
			@Override
			public Predicate toPredicate(Root<News> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<>();
				if (null != type) {
					predicates.add(cb.like(root.get("type"), type));
				}
				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		};
		return newsRepository.findAll(querySpecification, sort);
	}
}
