package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.News;
import cdit.ptit.java.repository.NewsRepository;
import cdit.ptit.java.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService {
private Logger logger = LoggerFactory.getLogger(NewsServiceImpl.class);
	
	@Autowired
	private NewsRepository repository;

	@Override
	public List<News> getAll() {
		// TODO Auto-generated method stub
		List<News> list = null;
		try {
			list = repository.findAll();
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public Page<News> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<News> list = null;
		try {
			list = repository.findAll(pageable);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public News findOne(int newsId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(newsId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(News news) {
		// TODO Auto-generated method stub
		try {
			repository.save(news);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(News news) {
		// TODO Auto-generated method stub
		try {
			repository.save(news);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int newsId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(newsId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}
}
