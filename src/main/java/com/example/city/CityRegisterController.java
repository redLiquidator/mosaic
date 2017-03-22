package com.example.city;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CityRegisterService;
import com.example.city.service.CitySearchService;
import com.example.domain.City;
import com.example.exception.NotFoundRuntimeException;
import com.example.form.CityForm;

@Controller
@RequestMapping("/city")
public class CityRegisterController {
	
	static Log log =LogFactory.getLog(CitySearchController.class);
	@Autowired
	CitySearchService citySearchService;
	
	@Autowired
	CityRegisterService cityRegisterService;
	
	@GetMapping("/register")
	public String registerform(CityForm cityForm){
		
		log.info("registerForm()");
		return "city/registerForm";
	}

	@PostMapping("/register")
	public String register(@Valid CityForm cityForm,BindingResult errors){
			log.info("register(" + cityForm + ")");
			System.out.println(cityForm);
		
		if(errors.hasErrors()){
			System.out.println(errors);
			return "city/registerForm";
		}
		
		cityRegisterService.register(cityForm, errors);
		if(errors.hasErrors()){
			System.out.println(errors);
			return "city/registerForm";
		}
		
		
		return "redirect:/city/registerSuccess/" + cityForm.getId();
	}
	
	@GetMapping("/registerSuccess/{id}")
	public String registerSuccess(@PathVariable int id, Model model){
		City city=citySearchService.getCityById(id);
		model.addAttribute("city",city);
		
		return "city/registerSuccess";
		
	}
}
