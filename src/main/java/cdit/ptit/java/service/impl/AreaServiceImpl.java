package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.Area;
import cdit.ptit.java.repository.AreaRepository;
import cdit.ptit.java.service.AreaService;
@Service
public class AreaServiceImpl implements AreaService {
	
	private Logger logger = LoggerFactory.getLogger(AreaServiceImpl.class);
	
	@Autowired
	private AreaRepository repository;

	@Override
	public List<Area> getAll() {
		// TODO Auto-generated method stub
		List<Area> list = null;
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
	public Page<Area> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Area> list = null;
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
	public Area findOne(int areaId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(areaId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(Area area) {
		// TODO Auto-generated method stub
		try {
			repository.save(area);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(Area area) {
		// TODO Auto-generated method stub
		try {
			repository.save(area);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int areaId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(areaId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Area> findByPId(int pId) {
		List<Area> list = null;
		try {
			list = repository.findByPid(pId);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return list;
	}

}
