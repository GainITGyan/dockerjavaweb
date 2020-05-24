package com.gyanitgyan.dockerjavaweb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gyanitgyan.dockerjavaweb.dto.UserDto;
import com.gyanitgyan.dockerjavaweb.service.IUserService;

@Controller
public class HomeController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response) {
	
		List<UserDto> users = this.userService.getAllUsers();
		
		request.setAttribute("users", users);
		
		return "index";
	}
	
}
