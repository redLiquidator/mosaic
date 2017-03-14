package com.example.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.domain.Dept;
import com.example.mapper.DeptMapper;

public class DeptSearchService {

	@Autowired
	DeptMapper deptMapper;
	
	public List<Dept> getList(){
		return getList(false);
	}
	
	public List<Dept> getList(boolean withEmp){
		List<Dept> list=null;
		if(withEmp)
			list=deptMapper.selectAllWithEmp();
		else
			list=deptMapper.selectAll();
		return list;
	}
	
}
