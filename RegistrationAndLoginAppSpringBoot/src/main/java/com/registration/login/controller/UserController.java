package com.registration.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.login.entity.User;
import com.registration.login.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegister(@ModelAttribute User user, HttpSession session) {
		
		System.out.println(user);
		
		userService.saveUser(user);
		session.setAttribute("msg", "User register successfully.");
		return "redirect:/";
	}
}
