package com.example.dept;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dept.service.DeptSearchService;
import com.example.domain.Dept;

@Controller
@RequestMapping("/dept")
public class DeptSearchController {
	
	static Log log=LogFactory.getLog(DeptSearchController.class);
	
	@Autowired
	DeptSearchService deptSearchService;
	
	@GetMapping("/list")
	public String getList(Model model){
		log.info("getList()");
		
		List<Dept> list=deptSearchService.getList();
		model.addAttribute("list",list);
		return "dept/list";
		
		
	}
	
	
	
	
}
