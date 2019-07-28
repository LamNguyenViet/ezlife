package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.News;


public interface NewsService {
	List<News> getAll();
	Page<News> getPage(Pageable pageable);
	News findOne(int newsId);
	int save(News news);
	int update(News news);
	int delete(int newsId);
}
