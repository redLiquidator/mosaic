package com.example.molecule.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.City;
import com.example.domain.Mass;
import com.example.domain.Molecule;
import com.example.mapper.CityMapper;
import com.example.mapper.MoleculeMapper;
import com.example.util.Pagination;

@Service
public class MoleculeSearchService {
	static Log log = LogFactory.getLog(MoleculeSearchService.class);
	
	@Autowired
	MoleculeMapper moleculeMapper;
	
	public List<Molecule> getList() {
		log.info("getList()");
		return getList(false);
	}
	
	public List<Molecule> getList(boolean withMass) {
		log.info("getList(" + withMass + ")");
		List<Molecule> list=null;
		if (withMass)
			list = moleculeMapper.selectAllWithMass();
		    System.err.println("aaaaaaaaaaaaa");
		    
		//else
		//	list = moleculeMapper.selectAll();
		
		return list;
	}
	
	public Map<String, Object> getPage(int pageNo) {
		return getPage(pageNo, false);
	}
	
	public Map<String, Object> getPage(int pageNo, boolean withMass) {
		Pagination paging = new Pagination();
		paging.setTotalItem(moleculeMapper.selectTotalCount());
		paging.setPageNo(pageNo);
		
		List<Molecule> list=null;
		if (withMass)
			list = moleculeMapper.selectPageWithMass(paging);
		else
			list = moleculeMapper.selectPage(paging);
		
		Map<String, Object> map = new HashMap<>();
		map.put("molecules", list);
		map.put("paging", paging);
		
		return map;	
	}
	
	
	public Molecule getMoleculeByFormula(String chemicalFormula) {
		log.info("getMoleculeByFormula(" + chemicalFormula + ")");
		return getMoleculeByFormula(chemicalFormula, false);
	}
	public Molecule getMoleculeByFormula(String chemicalFormula, boolean withMass) {
		log.info("getMoleculeByFormula(" + chemicalFormula + ", " + withMass + ")");
		Molecule molecule=null;
		if (withMass)
			molecule = moleculeMapper.selectByFormulaWithMass(chemicalFormula);
		else
			molecule = moleculeMapper.selectByFormula(chemicalFormula);
		
		return molecule;
	}
	
	

}
