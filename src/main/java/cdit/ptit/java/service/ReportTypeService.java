package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.ReportType;

public interface ReportTypeService {
	List<ReportType> getAll();
	Page<ReportType> getPage(Pageable pageable);
	ReportType findOne(int reportTypeId);
	int save(ReportType reportType);
	int update(ReportType reportType);
	int delete(int reportTypeId);
}
