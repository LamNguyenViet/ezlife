package cdit.ptit.java.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cdit.ptit.java.model.Social;

public interface SocialService {
	List<Social> getAll();
	Page<Social> getPage(Pageable pageable);
	Social findOne(int socialId);
	int save(Social social);
	int update(Social social);
	int delete(int socialId);
}
