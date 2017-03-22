package com.example.form;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.domain.City;

public class CityForm extends City{

	@NotNull
	@Size(max=35)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	@NotNull
	@Size(max=35)
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		if(name.equals(""))
			name=null;
		super.setName(name);
	}
	
	@Size(max=3)
	@Override
	public String getCountryCode() {
		// TODO Auto-generated method stub
		return super.getCountryCode();
	}

	@Override
	public void setCountryCode(String countryCode) {
		if(countryCode.equals(""))
			countryCode=null;
		super.setCountryCode(countryCode);
	}
	@Size(max=20)
	@Override
	public String getDistrict() {
		// TODO Auto-generated method stub
		return super.getDistrict();
	}
	
	@Override
	public void setDistrict(String district) {
		if(district.equals(""))
			district = null;
		super.setDistrict(district);
	}
	
	@Override
	public BigDecimal getPopulation() {
		// TODO Auto-generated method stub
		return super.getPopulation();
	}

	@Override
	public void setPopulation(BigDecimal population) {
		// TODO Auto-generated method stub
		super.setPopulation(population);
	}

}
