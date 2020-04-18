package com.sample.app.common.utils;

import org.springframework.beans.BeanUtils;

import com.sample.app.common.base.BaseDto;
import com.sample.app.common.base.BaseEntity;
import com.sample.app.common.base.BaseForm;

public class CommonUtils {

	private static CommonUtils utils = new CommonUtils();

	public CommonUtils() {
	}

	public static CommonUtils getUtils() {
		return utils;
	}

	/**
	 * Form ⇒ Dto
	 * 
	 * @param form
	 * @param dto
	 */
	public static void changeFormToDto(BaseForm<?> form, BaseDto<?> dto) {
		BeanUtils.copyProperties(form, dto);
	}

	/**
	 * Dto ⇒ Form
	 * 
	 * @param form
	 * @param dto
	 */
	public static void changeDtoToForm(BaseDto<?> dto, BaseForm<?> form) {
		BeanUtils.copyProperties(dto, form);
	}

	/**
	 * Dto ⇒ Entity
	 * 
	 * @param form
	 * @param dto
	 */
	public static void changeDtoToEntity(BaseDto<?> dto, BaseEntity<?> entity) {
		BeanUtils.copyProperties(dto, entity);
	}

	/**
	 * Entity ⇒ Dto
	 * 
	 * @param form
	 * @param dto
	 */
	public static void changeEntityToDto(BaseEntity<?> entity, BaseDto<?> dto) {
		BeanUtils.copyProperties(entity, dto);
	}

	public static void changeObjectToObject(Object source, Object target) {
		BeanUtils.copyProperties(source, target);
	}

}
