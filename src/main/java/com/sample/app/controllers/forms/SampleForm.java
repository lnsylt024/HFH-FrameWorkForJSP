package com.sample.app.controllers.forms;

import java.io.Serializable;
import java.util.List;

import com.sample.app.common.base.BaseForm;


public class SampleForm extends BaseForm<SampleForm> implements Serializable{

	/**
	 * 
	 */
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
	
	
	
	
}
