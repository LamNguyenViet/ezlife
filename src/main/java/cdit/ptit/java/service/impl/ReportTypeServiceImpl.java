package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.ReportType;
import cdit.ptit.java.repository.ReportTypeRepository;
import cdit.ptit.java.service.ReportTypeService;
@Service
public class ReportTypeServiceImpl implements ReportTypeService {
private Logger logger = LoggerFactory.getLogger(ReportTypeServiceImpl.class);
	
	@Autowired
	private ReportTypeRepository repository;

	@Override
	public List<ReportType> getAll() {
		// TODO Auto-generated method stub
		List<ReportType> list = null;
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
	public Page<ReportType> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<ReportType> list = null;
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
	public ReportType findOne(int reportTypeId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(reportTypeId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(ReportType reportType) {
		// TODO Auto-generated method stub
		try {
			repository.save(reportType);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(ReportType reportType) {
		// TODO Auto-generated method stub
		try {
			repository.save(reportType);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int reportTypeId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(reportTypeId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

}
