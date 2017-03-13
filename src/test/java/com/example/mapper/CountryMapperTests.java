package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Country;
import com.example.exception.NotFoundRuntimeException;
import com.example.util.Pagination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryMapperTests {
	
	@Autowired
	CountryMapper mapper;
	
	@Test
	public void test00_confirmMapper() {
		System.out.println("mapper=" + mapper);
	}
	
	@Test
	public void test00_selectTotalCount() {
		System.out.println("totalCount=" + mapper.selectTotalCount());
	}
	
	@Test
	public void test01_selectAll() {
		List<Country> list = mapper.selectAll();
		
		for (Country c : list)
			System.out.println(c); 
			
	}
	
	@Test
	public void test01_selectAllWithCity() {
		List<Country> list = mapper.selectAllWithCity();
		
		for (Country c : list)
			System.out.println(c);
		
	}
	
	@Test
	public void test02_selectPage() {
		Pagination paging = new Pagination();
		paging.setTotalItem(mapper.selectTotalCount());
		paging.setPageNo(20);
		
		List<Country> list = mapper.selectPage(paging);
		for (Country c : list)
			System.out.println(c);
		
	}
	
	@Test
	public void test02_selectPageWithCity() {
		
	}
	
	@Test
	public void test03_selectByCode() {
		Country country = mapper.selectByCode("xxx");
		
		System.out.println("country=" + country);
	}
	
	@Test
	public void test03_selectByCodeWithCity() {
		Country country = mapper.selectByCodeWithCity("KOR");
		
		System.out.println("country=" + country);
	}
	
	@Test
	public void test04_insert() {
		Country country = new Country();
		country.setCode("xxx");
		country.setName("java");
		
		Country c = mapper.selectByCode(country.getCode());
		if (c != null) {
			System.out.println("해당 나라 Code는 존재하는 값입니다.");
			return;
		}
		
		int cnt = mapper.insert(country);
		System.out.println(mapper.selectByCode(country.getCode()));
	}

	@Test
	public void test06_deleteByCode() {
		String code = "xxx";
		int cnt = mapper.deleteByCode(code);
		System.out.println("cnt=" + cnt);
		System.out.println("country=" + mapper.selectByCode(code));
	}


}
