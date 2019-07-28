package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.Social;
import cdit.ptit.java.repository.SocialRepository;
import cdit.ptit.java.service.SocialService;
@Service
public class SocialServiceImpl implements SocialService{
	
private Logger logger = LoggerFactory.getLogger(SocialServiceImpl.class);
	
	@Autowired
	private SocialRepository repository;

	@Override
	public List<Social> getAll() {
		// TODO Auto-generated method stub
		List<Social> list = null;
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
	public Page<Social> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Social> list = null;
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
	public Social findOne(int socialId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(socialId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(Social social) {
		// TODO Auto-generated method stub
		try {
			repository.save(social);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(Social social) {
		// TODO Auto-generated method stub
		try {
			repository.save(social);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int socialId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(socialId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

}
