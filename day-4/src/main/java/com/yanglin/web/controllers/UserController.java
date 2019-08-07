package com.yanglin.web.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yanglin.service.UserService;

/**
 * 作者: 杨霖
 * 日期: 2019年8月7日
 * 时间: 上午8:52:15
 */
@Controller
public class UserController {
	
	@Autowired
	UserService userServiceImpl;
	
	@RequestMapping("list")
	public String selectAll(Model model){
		List<Map<String, Object>> selectAll = userServiceImpl.selectAll();
		model.addAttribute("list", selectAll);
		return "list";
		
	}

}
