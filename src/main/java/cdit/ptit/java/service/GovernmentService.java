package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.Government;


public interface GovernmentService {
	List<Government> getAll();
	Page<Government> getPage(Pageable pageable);
	Government findOne(int governmentId);
	int save(Government government);
	int update(Government government);
	int delete(int governmentId);
}
