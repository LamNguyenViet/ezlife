package cdit.ptit.java.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cdit.ptit.java.model.Report;
import cdit.ptit.java.repository.ReportRepository;
import cdit.ptit.java.service.ReportService;
@Service
public class ReportServiceImpl implements ReportService {

private Logger logger = LoggerFactory.getLogger(ReportServiceImpl.class);
	
	@Autowired
	private ReportRepository repository;

	@Override
	public List<Report> getAll() {
		// TODO Auto-generated method stub
		List<Report> list = null;
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
	public Page<Report> getPage(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Report> list = null;
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
	public Report findOne(int reportId) {
		// TODO Auto-generated method stub
		try {
			return repository.findById(reportId);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int save(Report report) {
		// TODO Auto-generated method stub
		try {
			repository.save(report);
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int update(Report report) {
		// TODO Auto-generated method stub
		try {
			repository.save(report);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int reportId) {
		// TODO Auto-generated method stub
		try {
			repository.deleteById(reportId);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

	
}
