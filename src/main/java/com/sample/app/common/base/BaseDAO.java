package com.sample.app.common.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDAO<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>{

	// T : Entityの型
	// S : プロジェクションする型（非Entity）

//	<S extends T> S save(S entity);
//
//	void delete(T entity);
}
