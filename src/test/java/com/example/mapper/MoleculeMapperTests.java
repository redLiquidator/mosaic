package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Country;
import com.example.domain.Molecule;
import com.example.exception.NotFoundRuntimeException;
import com.example.util.Pagination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoleculeMapperTests {
	
	@Autowired
	MoleculeMapper mapper;
	
	
	//@Test
	public void test00_confirmMapper() {
		System.out.println("mapper=" + mapper);
	}
	
	//@Test
	public void test00_selectTotalCount() {
		System.out.println("totalCount=" + mapper.selectTotalCount());
	}
	
	@Test
	public void test01_selectAll() {
		List<Molecule> list = mapper.selectAll();
		
		for (Molecule m : list)
			System.out.println(m); 
			
	}
	
	@Test
	public void test01_selectAllWithMass() {
		List<Molecule> list = mapper.selectAllWithMass();
		
		for (Molecule m : list)
			System.out.println(m);
		
	}
	
	//@Test
	public void test02_selectPage() {
		Pagination paging = new Pagination();
		paging.setTotalItem(mapper.selectTotalCount());
		paging.setPageNo(20);
		
		List<Molecule> list = mapper.selectPage(paging);
		for (Molecule m : list)
			System.out.println(m);
		
	}
	
	//@Test
	public void test02_selectPageWithMass() {
		
	}
	
	//@Test
	public void test03_selectByFormula() {
		Molecule molecule = mapper.selectByFormula("C3H6O");
		
		System.out.println("molecule=" + molecule);
	}
	
	//@Test
	public void test03_selectByFormulaWithMass() {
		Molecule molecule = mapper.selectByFormulaWithMass("C3H6O");
		
		System.out.println("molecule=" + molecule);
	}
	
	//@Test
	public void test04_insert() {
		Molecule molecule = new Molecule();
		molecule.setName("xxx");
		molecule.setChemicalFormula("C3H6O");
		
		Molecule m = mapper.selectByFormula(molecule.getChemicalFormula());
		if (m!= null) {
			System.out.println("해당Formula 는 존재하는 값입니다.");
			return;
		}
		
		int cnt = mapper.insert(molecule);
		System.out.println(mapper.selectByFormula(molecule.getChemicalFormula()));
	}

	//@Test
	public void test06_deleteByFormula() {
		String chemicalFormula = "C3H6O";
		int cnt = mapper.deleteByFormula(chemicalFormula);
		System.out.println("cnt=" + cnt);
		System.out.println("molecule=" + mapper.selectByFormula(chemicalFormula));
	}


}
