package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.NewsType;


public interface NewsTypeService {
	List<NewsType> getAll();
	Page<NewsType> getPage(Pageable pageable);
	NewsType findOne(int newsTypeId);
	int save(NewsType newsType);
	int update(NewsType newsType);
	int delete(int newsTypeId);
}
