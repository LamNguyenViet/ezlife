package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.Social;

public interface SocialRepository extends JpaRepository<Social, Integer> {
	Social findById(int id);
}
