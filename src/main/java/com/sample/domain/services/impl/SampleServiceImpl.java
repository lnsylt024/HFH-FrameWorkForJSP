package com.sample.domain.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sample.app.common.base.BaseService;
import com.sample.app.common.utils.CommonUtils;
import com.sample.domain.dtos.SampleDto;
import com.sample.domain.models.SampleEntity;
import com.sample.domain.repositories.SampleDAO;
import com.sample.domain.services.SampleService;

@Service
public class SampleServiceImpl extends BaseService<SampleDto> implements SampleService<SampleDto> {

	@Autowired
	private SampleDAO dao;
	
	@Override
	public List<SampleDto> list() {
		List<SampleDto> listDto = new ArrayList<>();
		List<SampleEntity> listEntity = dao.findAll();
		
		for(SampleEntity entity : listEntity) {
			SampleDto dto = new SampleDto();
			CommonUtils.changeEntityToDto(entity, dto);
			listDto.add(dto);
		}		
		return listDto;
	}

	@Override
	public SampleDto listById(int id) {

		SampleEntity entity = dao.getOne(id);
		SampleDto dto = new SampleDto();
		CommonUtils.changeEntityToDto(entity, dto);
		return dto;
	}

	@Override
	public SampleDto add(SampleDto dto) {

		SampleEntity entity = new SampleEntity();
		CommonUtils.changeDtoToEntity(dto, entity);
		dao.save(entity);
		
		return dto;
	}

	@Override
	public SampleDto edit(SampleDto dto) {

		SampleEntity entity = new SampleEntity();
		CommonUtils.changeDtoToEntity(dto, entity);
		
		dao.save(entity);
		return dto;
	}

	@Override
	public void delete(int id) {
		
		SampleEntity entity = dao.getOne(id);
		if(!StringUtils.isEmpty(entity)) {
			dao.delete(entity);
		}
	}

	@Override
	public List<SampleDto> listWithKey(String searchkey) {

		List<SampleDto> listDto = new ArrayList<>();
		List<SampleEntity> listEntity = dao.findBykey(searchkey);
		
		for(SampleEntity entity : listEntity) {
			SampleDto dto = new SampleDto();
			CommonUtils.changeEntityToDto(entity, dto);
			listDto.add(dto);
		}		
		return listDto;
	}

}
