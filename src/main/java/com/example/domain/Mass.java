package com.example.domain;

import java.util.List;

public class Mass {
	
	private String chemicalFormula;
	private Double molarMass;
	private List<Mass> masses;
	
	
	
	public List<Mass> getMasses() {
		return masses;
	}
	public void setMasses(List<Mass> masses) {
		this.masses = masses;
	}
	public String getChemicalFormula() {
		return chemicalFormula;
	}
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	public Double getMolarMass() {
		return molarMass;
	}
	public void setMolarMass(Double molarMass) {
		this.molarMass = molarMass;
	}
	
	
	
	

}
