package com.jason.maven.web.weichat_subscription.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jason.maven.web.weichat_subscription.model.User;
import com.jason.maven.web.weichat_subscription.model.UserT;
import com.jason.maven.web.weichat_subscription.service.IUserTService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	@Resource
	private IUserTService userService;

	// /user/test?id=1
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));
		
		UserT user = userService.getUserById(userId);
		
		log.debug(user.toString());
		model.addAttribute("user", user);
		return "index";
	}
}
