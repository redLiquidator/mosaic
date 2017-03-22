package com.example.form;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.domain.City;
import com.example.domain.Country;

public class CountryForm extends Country{

	@Override
	public List<City> getCitys() {
		// TODO Auto-generated method stub
		return super.getCitys();
	}

	@Override
	public void setCitys(List<City> citys) {
		// TODO Auto-generated method stub
		super.setCitys(citys);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

    @Size(max=3)
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return super.getCode();
	}

	@Override
	public void setCode(String code) {
		// TODO Auto-generated method stub
		super.setCode(code);
	}
	@NotNull
	@Size(max=52)
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	@Size(max=20)
	@Override
	public String getContinent() {
		// TODO Auto-generated method stub
		return super.getContinent();
	}

	@Override
	public void setContinent(String continent) {
		// TODO Auto-generated method stub
		super.setContinent(continent);
	}
	
	@Size(max=26)
	@Override
	public String getRegion() {
		// TODO Auto-generated method stub
		return super.getRegion();
	}

	@Override
	public void setRegion(String region) {
		// TODO Auto-generated method stub
		super.setRegion(region);
	}
	@Digits(integer=8,fraction=2)
	@Override
	public BigDecimal getSurfaceArea() {
		// TODO Auto-generated method stub
		return super.getSurfaceArea();
	}

	@Override
	public void setSurfaceArea(BigDecimal surfaceArea) {
		// TODO Auto-generated method stub
		super.setSurfaceArea(surfaceArea);
	}
	@Digits(integer=6,fraction=0)
	@Override
	public BigDecimal getIndepYear() {
		// TODO Auto-generated method stub
		return super.getIndepYear();
	}

	@Override
	public void setIndepYear(BigDecimal indepYear) {
		// TODO Auto-generated method stub
		super.setIndepYear(indepYear);
	}
	@Digits(integer=11,fraction=0)
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
	@Digits(integer=2,fraction=1)
	@Override
	public BigDecimal getLifeExpectancy() {
		// TODO Auto-generated method stub
		return super.getLifeExpectancy();
	}

	@Override
	public void setLifeExpectancy(BigDecimal lifeExpectancy) {
		// TODO Auto-generated method stub
		super.setLifeExpectancy(lifeExpectancy);
	}
	@Digits(integer=8,fraction=2)
	@Override
	public BigDecimal getGnp() {
		// TODO Auto-generated method stub
		return super.getGnp();
	}

	@Override
	public void setGnp(BigDecimal gnp) {
		// TODO Auto-generated method stub
		super.setGnp(gnp);
	}
	@Digits(integer=8,fraction=2)
	@Override
	public BigDecimal getGnpOld() {
		// TODO Auto-generated method stub
		return super.getGnpOld();
	}

	@Override
	public void setGnpOld(BigDecimal gnpOld) {
		// TODO Auto-generated method stub
		super.setGnpOld(gnpOld);
	}
	@Size(max=45)
	@Override
	public String getLocalName() {
		// TODO Auto-generated method stub
		return super.getLocalName();
	}

	@Override
	public void setLocalName(String localName) {
		// TODO Auto-generated method stub
		super.setLocalName(localName);
	}
	@Size(max=45)
	@Override
	public String getGovernmentForm() {
		// TODO Auto-generated method stub
		return super.getGovernmentForm();
	}

	@Override
	public void setGovernmentForm(String governmentForm) {
		// TODO Auto-generated method stub
		super.setGovernmentForm(governmentForm);
	}
	@Size(max=60)
	@Override
	public String getHeadOfState() {
		// TODO Auto-generated method stub
		return super.getHeadOfState();
	}

	@Override
	public void setHeadOfState(String headOfState) {
		// TODO Auto-generated method stub
		super.setHeadOfState(headOfState);
	}
	@Digits(integer=11,fraction=0)
	@Override
	public BigDecimal getCapital() {
		// TODO Auto-generated method stub
		return super.getCapital();
	}

	@Override
	public void setCapital(BigDecimal capital) {
		// TODO Auto-generated method stub
		super.setCapital(capital);
	}
  @Size(max=2)
	@Override
	public String getCode2() {
		// TODO Auto-generated method stub
		return super.getCode2();
	}

	@Override
	public void setCode2(String code2) {
		// TODO Auto-generated method stub
		super.setCode2(code2);
	}

}
