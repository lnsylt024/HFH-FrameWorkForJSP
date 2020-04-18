package com.sample.app.common.base;

import org.springframework.util.StringUtils;

public abstract class BaseController {
	
	/**
	 * 画面遷移（パス指定）
	 * 
	 * @param path
	 * @param page
	 * @return
	 */
	public String goNextPathPage(String path, String page) {
		if (StringUtils.isEmpty(path)) {
			return page;
		} else {
			if (!path.endsWith("/")) {

				return path + "/" + page;
			}
			return path + page;
		}
	}

	/**
	 * 画面遷移（パス指定なし）
	 * 
	 * @param page
	 * @return
	 */
	public String goNextPage(String page) {
		return page;
	}

	/**
	 * 前画面遷移（パス指定なし）
	 * 
	 * @param page
	 * @return
	 */
	public String goBackPathPage(String path,String page) {
		if (StringUtils.isEmpty(path)) {
			return page;
		} else {
			if (!path.endsWith("/")) {
				return path + "/" + page;
			}
			return path + page;
		}
	}
	/**
	 * 前画面遷移（パス指定なし）
	 * 
	 * @param page
	 * @return
	 */
	public String goBackPage(String page) {
		return page;
	}

	/**
	 * 画面遷移（redirect）
	 * 
	 * @param contextPath
	 * @return
	 */
	public String goRedirectPage(String contextPath) {
		return "redirect:/" + contextPath;
	}
	
	/**
	 * 画面遷移（redirect）
	 * 
	 * @param contextPath
	 * @return
	 */
	public String goRedirectPathPage(String path, String contextPath) {
		if (StringUtils.isEmpty(path)) {
			return this.goRedirectPage(contextPath);
		} else {
			if (!path.endsWith("/")) {
				return this.goRedirectPage(path + "/" + contextPath);
			}
			return this.goRedirectPage(path +contextPath);
		}
	}
}
