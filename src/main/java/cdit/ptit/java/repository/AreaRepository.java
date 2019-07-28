package cdit.ptit.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.Area;

public interface AreaRepository extends JpaRepository<Area, Integer> {
	Area findById(int id);
	List<Area> findByPid(int pId);
}
