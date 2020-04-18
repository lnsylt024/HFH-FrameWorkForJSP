package com.sample.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.app.common.base.BaseDAO;
import com.sample.domain.models.SampleEntity;

@Repository
public interface SampleDAO extends BaseDAO<SampleEntity, Integer> {
//
//	SampleEntity saveAll(SampleEntity entity);
//
//	void deleteAll(SampleEntity entity);
	
	@Query("select sample from SampleEntity sample where sample.name like %:name%")
	List<SampleEntity> findBykey(String name);
}
