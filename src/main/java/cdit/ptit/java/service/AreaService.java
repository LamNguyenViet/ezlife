package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.Area;

public interface AreaService {
	List<Area> getAll();
	Page<Area> getPage(Pageable pageable);
	Area findOne(int areaId);
	int save(Area area);
	int update(Area area);
	int delete(int areaId);
	List<Area> findByPId(int pId);
}
