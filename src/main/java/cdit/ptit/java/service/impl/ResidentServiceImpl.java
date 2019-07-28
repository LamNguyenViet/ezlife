package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.Resident;
import cdit.ptit.java.repository.ResidentRepository;
import cdit.ptit.java.service.ResidentService;
@Service
public class ResidentServiceImpl implements ResidentService {
private Logger logger = LoggerFactory.getLogger(ResidentServiceImpl.class);
	
	@Autowired
	private ResidentRepository repository;

	@Override
	public List<Resident> getAll() {
		// TODO Auto-generated method stub
		List<Resident> list = null;
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
	public Page<Resident> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Resident> list = null;
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
	public Resident findOne(int residentId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(residentId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(Resident resident) {
		// TODO Auto-generated method stub
		try {
			repository.save(resident);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(Resident resident) {
		// TODO Auto-generated method stub
		try {
			repository.save(resident);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int residentId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(residentId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}


}
