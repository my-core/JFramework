package com.jframework.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jframework.model.User;
import com.jframework.service.IUserService;

/**
 * 采用注解的方式，可以明确地定义该类为处理请求的Controller类
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	// region ==============登录相关==================
	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		LoginUser.setCurrentUser(null);
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	/**
	 * 用户登录
	 *
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletResponse httpResponse) throws IOException {
		/*
		 * BaseResponse<UserModel> logResponse =
		 * IUserService().userLogin(loginRequest); ModelAndView mv = null; if
		 * (logResponse.isOk()) {
		 * LoginUser.setCurrentUser(logResponse.getReturnData());
		 * httpResponse.sendRedirect("/"); } else { mv = new
		 * ModelAndView("login"); mv.addObject("msg",
		 * logResponse.getMsgContent()); } return mv;
		 */
		return null;
	}

	// endregion
	/*
	 * @ApiOperation(value = "获取用户列表", httpMethod = "GET", response =
	 * BaseResponse.class, notes = "根据指定条件获取用户列表")
	 */
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public ModelAndView GetUserList(HttpServletRequest request) {

		List<User> list = userService.GetUserList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("userlist");
		return mv;
	}
}
