package com.vd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vd.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = {"/", "/departments"}, method = RequestMethod.GET)
	public String getDepartments(Model model) {
		
		model.addAttribute("departments", departmentService.getDepartments());
		
		return "index";
	}
}
