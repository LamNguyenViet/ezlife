package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.Resident;

public interface ResidentService {
	List<Resident> getAll();
	Page<Resident> getPage(Pageable pageable);
	Resident findOne(int residentId);
	int save(Resident resident);
	int update(Resident resident);
	int delete(int residentId);
}
