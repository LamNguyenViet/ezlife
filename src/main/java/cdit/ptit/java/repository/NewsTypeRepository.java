package cdit.ptit.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdit.ptit.java.model.NewsType;

public interface NewsTypeRepository extends JpaRepository<NewsType, Integer> {
	NewsType findById(int id);
}
