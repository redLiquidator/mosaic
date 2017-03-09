package com.example.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CitySearchService;

@Controller
@RequestMapping("/city")
public class CitySearchController {
	
	@Autowired
	CitySearchService citySearchService;
	
	@GetMapping("/list")
	public String getList(Model model) {
		
		return "city/list";
	}
	
	@GetMapping("/page/{pageNo}")
	public String getPage(@PathVariable int pageNo, Model model) {
		
		return "city/page";
	}
	
	@GetMapping("/item/{id}")
	public String getCityById(@PathVariable int id, Model model) {
		
		return "city/item";
	}
	

}
