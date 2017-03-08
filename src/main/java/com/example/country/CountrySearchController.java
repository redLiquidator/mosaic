package com.example.country;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.country.service.CountrySearchService;
import com.example.domain.Country;
import com.example.exception.NotFoundRuntimeException;

@Controller
@RequestMapping("/country")
public class CountrySearchController {
	
	static Log log = LogFactory.getLog(CountrySearchController.class);
	
	@Autowired
	CountrySearchService countrySearchService;
	
	@GetMapping("/list")
	public String getList(Model model) {
		log.info("getList()");
		
		List<Country> list = countrySearchService.getList(); 
		model.addAttribute("list", list);
		
		return "country/list";
	}
	
	@GetMapping("/item/{code}")
	public String getItem(@PathVariable String code, Model model) {
		log.info("getItem(" + code + ")");
		
		try {
			Country c = countrySearchService.getCountryByCode(code);
			model.addAttribute("country", c);
		} catch (NotFoundRuntimeException e) {
			model.addAttribute("error", e.getMessage());
		}
		
		return "country/item";
	}
	
	
	
	
	

}
