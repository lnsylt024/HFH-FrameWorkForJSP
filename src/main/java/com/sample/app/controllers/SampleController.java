package com.sample.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.app.common.base.BaseController;
import com.sample.app.common.utils.CommonUtils;
import com.sample.app.controllers.forms.SampleForm;
import com.sample.app.controllers.forms.SearchForm;
import com.sample.domain.dtos.SampleDto;
import com.sample.domain.services.SampleService;

//JSPへ遷移の用
@Controller
@RequestMapping("/sample")
public class SampleController extends BaseController {

	@Autowired
	private SampleService<SampleDto> service;

	private SampleDto dto = new SampleDto();

	@ModelAttribute
	public void call() {
		System.out.println("call sample controller.");
	}
	/**
	 * 初期表示(一覧画面)
	 * 
	 * @return
	 */
	@RequestMapping("init")
	public String init(Model model, SampleForm form) {
		
		List<SampleDto> resultList = service.list();
		model.addAttribute("sampledata", resultList);
		
		return goNextPathPage("sample", "listpage");
	}

	/**
	 * 画面遷移（新規へ）
	 * 
	 * @return
	 */
	@RequestMapping("append")
	public String append() {
		return goNextPathPage("sample", "registerpage");
	}

	/**
	 * 画面遷移（編集へ）
	 * 
	 * @return
	 */
	@RequestMapping("edit/{id}")
	public String edit(@PathVariable int id, SampleForm form, Model model) {
		
		SampleDto dto = service.listById(id);
		CommonUtils.changeDtoToForm(dto, form);
		model.addAttribute("sampleForm", form);
		
		return goNextPathPage("sample", "editpage");
	}

	/**
	 * 画面イベント（検索）
	 * 
	 * @return
	 */
	@RequestMapping("search")
	public String search(SearchForm searchForm, Model model) {
		List<SampleDto> resultList = service.listWithKey(searchForm.getSearchkey());
		model.addAttribute("sampledata", resultList);
		
		return goNextPathPage("sample", "listpage");
	}

	/**
	 * 画面イベント（追加）― 初期画面へ Form検証あり
	 * 
	 * @return
	 */
	@RequestMapping("add")
	public String add(@Validated SampleForm form) {

		CommonUtils.changeFormToDto(form, dto);
		dto = service.add(dto);

		return goRedirectPathPage("sample", "init");
	}

	/**
	 * 画面イベント（更新）― 初期画面へ
	 * 
	 * @return
	 */
	@RequestMapping("update")
	public String update(@Validated SampleForm form) {
		
		CommonUtils.changeFormToDto(form, dto);
		dto = service.edit(dto);

		return goRedirectPathPage("sample", "init");
	}

	/**
	 * 画面イベント（削除）― 初期画面へ
	 * 
	 * @return
	 */
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		
		service.delete(id);
		
		return goRedirectPathPage("sample", "init");
	}

	/**
	 * 画面イベント（戻る）― 初期画面へ
	 * 
	 * @param page
	 * @return
	 */
	@RequestMapping("back/{page}")
	public String back(@PathVariable String page) {
		return goRedirectPathPage("sample", page);
	}
}
