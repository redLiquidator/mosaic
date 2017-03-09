package com.example.city;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CitySearchService;
import com.example.domain.City;

@Controller
@RequestMapping("/city")
public class CitySearchController {
	
	static Log log = LogFactory.getLog(CitySearchController.class);
	@Autowired
	CitySearchService citySearchService;
	
	@GetMapping("/list")
	public String getList(Model model) {
		log.info("getList()");
		
		List<City> list = citySearchService.getListAll(true);
		model.addAttribute("citys", list);
		
		return "city/list";
	}
	
	@GetMapping("/page/{pageNo}")
	public String getPage(@PathVariable int pageNo, Model model) {
		log.info("getPage(" + pageNo + ")");
		
		Map<String, Object> page = citySearchService.getPage(pageNo);
		model.addAttribute("page", page);
		
		return "city/page";
	}
	
	@GetMapping("/item/{id}")
	public String getItemById(@PathVariable int id, Model model) {
		
		return "city/item";
	}
	

}
