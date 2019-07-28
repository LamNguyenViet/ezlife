package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.ReportType;

public interface ReportTypeRepository extends JpaRepository<ReportType, Integer> {
	ReportType findById(int id);
}
