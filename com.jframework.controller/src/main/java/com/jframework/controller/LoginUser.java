package com.jframework.controller;

import com.jframework.model.User;

/**
 * Created by yangliangbin on 2016/9/13.
 */
public class LoginUser {

	/**
	 * 获取当前登录用户信息
	 *
	 * @return
	 */
	public static User getCurrentUser() {
		Object obj = WebUtils.getSession("LoginUser");
		if (obj != null)
			return (User) obj;
		return null;
	}

	/**
	 * 设置当前登录用户信息
	 *
	 * @param model
	 */
	public static void setCurrentUser(User model) {
		if (model == null)
			WebUtils.delSession("LoginUser");
		else
			WebUtils.setSession("LoginUser", model);
	}
}
