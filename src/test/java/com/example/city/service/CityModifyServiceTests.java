package com.example.city.service;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

import com.example.domain.City;
import com.example.form.CityForm;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityModifyServiceTests {
	
	@Autowired
	CitySearchService citySearchService;
	
	@Autowired
	CityModifyService cityModifyService;
	
	@Autowired
	Validator validator;
	
	
	@Test
	public void test00_confirmCitySearchService() {
		System.out.println("citySearchService=" + citySearchService);
		
	}
	
	@Test
	public void test00_confirmCityModifyService() {
		System.out.println("CityModifyService=" + cityModifyService);
		
	}

	@Test
	public void test00_confirmValidator() {
		System.out.println("Validator=" + validator);
		
	}
	@Test
	public void test01_modify(){
		CityForm cityForm=new CityForm();
		BindingResult errors =new BeanPropertyBindingResult(cityForm, "cityForm");
		
		cityForm.setId(3079);
		cityForm.setName("xxx");
		cityForm.setCountryCode("USA");
		
		
		validator.validate(cityForm, errors);
		if(errors.hasErrors()){
			System.out.println("errors"+errors);
			return;
		}
		cityModifyService.modify(cityForm,errors);
		if(errors.hasErrors()){
			System.out.println("errors"+errors);
			return;
		}
		System.out.println("city"+citySearchService.getCityById(cityForm.getId()));
		
	}
	
	
	
}
