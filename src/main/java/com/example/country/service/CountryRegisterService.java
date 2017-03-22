package com.example.country.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.domain.City;
import com.example.domain.Country;
import com.example.mapper.CityMapper;
import com.example.mapper.CountryMapper;

@Service
public class CountryRegisterService {

		
		@Autowired
		CountryMapper countryMapper;
		
		public void register(Country country,BindingResult errors){
			
			Country confirm=countryMapper.selectByCode(country.getCode());
			
			if(confirm!=null)
			errors.reject("InvalidCountryCode","유효한 countrycode 가 아닙니다.");
			
				if(!errors.hasErrors())
				countryMapper.insert(country);
			
		}
}
