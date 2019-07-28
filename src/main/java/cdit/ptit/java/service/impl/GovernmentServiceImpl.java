package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.Government;
import cdit.ptit.java.repository.GovernmentRepository;
import cdit.ptit.java.service.GovernmentService;
@Service
public class GovernmentServiceImpl implements GovernmentService {
	
	private Logger logger = LoggerFactory.getLogger(GovernmentServiceImpl.class);
	
	@Autowired
	private GovernmentRepository repository;

	@Override
	public List<Government> getAll() {
		// TODO Auto-generated method stub
		List<Government> list = null;
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
	public Page<Government> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Government> list = null;
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
	public Government findOne(int governmentId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(governmentId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(Government government) {
		// TODO Auto-generated method stub
		try {
			repository.save(government);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(Government government) {
		// TODO Auto-generated method stub
		try {
			repository.save(government);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int governmentId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(governmentId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

}
