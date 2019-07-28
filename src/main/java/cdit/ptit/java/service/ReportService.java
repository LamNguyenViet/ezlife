package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.Report;


public interface ReportService {
	List<Report> getAll();
	Page<Report> getPage(Pageable pageable);
	Report findOne(int reportId);
	int save(Report report);
	int update(Report report);
	int delete(int reportId);
}
