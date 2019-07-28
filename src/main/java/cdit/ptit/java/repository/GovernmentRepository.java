package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.Government;

public interface GovernmentRepository extends JpaRepository<Government, Integer> {
	Government findById(int id);
}
