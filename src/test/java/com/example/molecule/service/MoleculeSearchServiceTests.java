package com.example.molecule.service;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Country;
import com.example.domain.Molecule;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoleculeSearchServiceTests {
	
	@Autowired
	MoleculeSearchService service;
	
	@Test
	public void test00_confirmService() {
		System.out.println("service=" + service); 
	}
	
	@Test
	public void test01_getList() {
		List<Molecule> list = service.getList();
		for (Molecule m : list)
			System.out.println(m);
	}
	
	@Test
	public void test01_getListAll_withMass() {
		List<Molecule> list = service.getList(true);
		for (Molecule m : list)
			System.out.println(m);
	}
	
	@Test
	public void test02_getPage() {
		Map<String, Object> map = service.getPage(1,true);
		System.out.println(map.get("molecules"));
		System.out.println(map.get("paging"));
		
	}
	
	@Test
	public void test02_getPage_withMass() {
		Map<String, Object> map = service.getPage(1, true);
		
		List<Molecule> list =  (List<Molecule>) map.get("molecules");
		for (Molecule m : list)
			System.out.println(m);
		
		System.out.println(map.get("paging"));
	}
	
	@Test
	public void test03_getMoleculeByFormula() {
		Molecule m = service.getMoleculeByFormula("C3H6O");
		System.out.println(m);
	}
	
	@Test
	public void test03_getMoleculeByFormula_withMass() {
		Molecule m = service.getMoleculeByFormula("C3H6O", true);
		System.out.println(m);
	}

}
