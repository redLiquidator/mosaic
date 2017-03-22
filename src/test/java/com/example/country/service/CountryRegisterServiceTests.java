package com.example.country.service;

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
import com.example.form.CountryForm;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryRegisterServiceTests {
	
	@Autowired
	CountrySearchService countrySearchService;
	
	@Autowired
	CountryRegisterService countryRegisterService;
	
	@Autowired
	Validator validator;
	
	
	@Test
	public void test00_confirmCountrySearchService() {
		System.out.println("countrySearchService=" + countrySearchService);
		
	}
	
	@Test
	public void test00_confirmCityRegisterService() {
		System.out.println("countryRegisterService=" + countryRegisterService);
		
	}

	@Test
	public void test00_confirmValidator() {
		System.out.println("Validator=" + validator);
		
	}
	@Test
	public void test01_register(){
		CountryForm countryForm=new CountryForm();
		countryForm.setCode("xyz");
		countryForm.setName("java");
		
		BindingResult errors=new BeanPropertyBindingResult(countryForm, "countryForm");
		validator.validate(countryForm, errors);
		if(errors.hasErrors()){
			System.out.println(errors);
			return;
		}
		
		countryRegisterService.register(countryForm,errors);
		if(errors.hasErrors()){
			System.out.println(errors);
			return;
		}
		System.out.println ("country="+countrySearchService.getCountryByCode(countryForm.getCode()));
	}
	
	
	
}
