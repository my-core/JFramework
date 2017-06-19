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
 * ����ע��ķ�ʽ��������ȷ�ض������Ϊ���������Controller��
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	// region ==============��¼���==================
	/**
	 * �û���¼
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		LoginUser.setCurrentUser(null);
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	/**
	 * �û���¼
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
	 * @ApiOperation(value = "��ȡ�û��б�", httpMethod = "GET", response =
	 * BaseResponse.class, notes = "����ָ��������ȡ�û��б�")
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
