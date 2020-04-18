package com.sample.domain.dtos;

import java.io.Serializable;
import java.util.List;

import com.sample.app.common.base.BaseDto;


public class SampleDto extends BaseDto<SampleDto> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 番号
	 */
	private int id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 備考
	 */
	private String remark;

	/**
	 * 携帯種類
	 */
	private List<String> phoneType;

	public SampleDto() {

	}

	public SampleDto(int id, String name, String remark, List<String> phoneType) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
		this.phoneType = phoneType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(List<String> phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public String toString() {
		return "SampleDto [id=" + id + ", name=" + name + ", remark=" + remark + ", phoneType=" + phoneType + "]";
	}

}
