package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.NewsType;
import cdit.ptit.java.repository.NewsTypeRepository;
import cdit.ptit.java.service.NewsTypeService;
@Service
public class NewsTypeServiceImpl implements NewsTypeService {
private Logger logger = LoggerFactory.getLogger(NewsTypeServiceImpl.class);
	
	@Autowired
	private NewsTypeRepository repository;

	@Override
	public List<NewsType> getAll() {
		// TODO Auto-generated method stub
		List<NewsType> list = null;
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
	public Page<NewsType> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<NewsType> list = null;
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
	public NewsType findOne(int newsTypeId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(newsTypeId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(NewsType newsType) {
		// TODO Auto-generated method stub
		try {
			repository.save(newsType);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(NewsType newsType) {
		// TODO Auto-generated method stub
		try {
			repository.save(newsType);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int newsTypeId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(newsTypeId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}


}
