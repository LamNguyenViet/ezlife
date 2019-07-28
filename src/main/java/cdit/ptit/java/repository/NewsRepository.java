package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.News;

public interface NewsRepository extends JpaRepository<News, Integer> {
	News findById(int id);
}
