package com.sample.app.controllers.forms;

import com.sample.app.common.base.BaseForm;

public class SearchForm extends BaseForm<SearchForm> {

	private static final long serialVersionUID = 1L;
	
	private String searchkey;

	public String getSearchkey() {
		return searchkey;
	}

	public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
	}
	
	
}
