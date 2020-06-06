package com.vd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vd.model.Department;

@Service
public class DepartmentService {
	
	public List<Department> getDepartments(){
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(new Department(1, "Java"));
		departments.add(new Department(2, "React"));
		return departments;
	}
}
