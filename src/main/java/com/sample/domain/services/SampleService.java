package com.sample.domain.services;

import java.util.List;

public interface SampleService<SampleDto> {
	/**
	 * 検索一覧（全件）
	 * 
	 * @return
	 */
	List<SampleDto> list();
	
	/**
	 * 検索一覧(条件あり)
	 * 
	 * @param searchkey
	 * @return
	 */
	List<SampleDto> listWithKey(String searchkey);

	/**
	 * 検索対象（Id）
	 * 
	 * @param id
	 * @return
	 */
	SampleDto listById(int id);

	/**
	 * 追加
	 * 
	 * @param p
	 * @return
	 */
	SampleDto add(SampleDto dto);

	/**
	 * 更新
	 * 
	 * @param p
	 * @return
	 */
	SampleDto edit(SampleDto dto);

	/**
	 * 削除(Id)
	 * 
	 * @param id
	 * @return
	 */
	void delete(int id);
}
