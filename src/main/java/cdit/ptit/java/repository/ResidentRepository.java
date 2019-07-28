package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.Resident;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {
	Resident findById(int id);
}
