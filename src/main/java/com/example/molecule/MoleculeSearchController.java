package com.example.molecule;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CitySearchService;
import com.example.domain.City;
import com.example.domain.Molecule;
import com.example.exception.NotFoundRuntimeException;
import com.example.molecule.service.MoleculeSearchService;

@Controller
@RequestMapping("/molecule")
public class MoleculeSearchController {
	
	static Log log = LogFactory.getLog(MoleculeSearchController.class);
	@Autowired
	MoleculeSearchService moleculeSearchService;
	
	@GetMapping("/list")
	public String getList(Model model) {
		
		
		List<Molecule> list = moleculeSearchService.getList(true);
		model.addAttribute("molecules", list);
		log.info("getList()");
		
		return "molecule/list";
	}
	
	@GetMapping("/page/{pageNo}")
	public String getPage(@PathVariable int pageNo, Model model) {
		log.info("getPage(" + pageNo + ")");
		
		Map<String, Object> page = moleculeSearchService.getPage(pageNo);
		model.addAttribute("page", page);
		
		return "city/page";
	}
	
	@GetMapping("/item/{id}")
	public String getItemById(@PathVariable int id, Model model) {
		log.info("getItem("+ id + ")");
		
//		Molecule molecule = moleculeSearchService.getMoleculeByFormula(chemical_formula, true);
//		model.addAttribute("molecule", molecule);
		
		return "molecule/item";
	}
	

}
