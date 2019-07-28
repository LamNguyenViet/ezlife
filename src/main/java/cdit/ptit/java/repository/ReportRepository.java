package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.Report;

public interface ReportRepository extends JpaRepository<Report, Integer> {
	Report findById(int id);
}
