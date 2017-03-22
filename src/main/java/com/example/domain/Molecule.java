package com.example.domain;

public class Molecule {
	
	private String name; 
	private String chemicalFormula;
	private Double density;
	private Double averageMeltingPoint;
	private Double acidity;
	private String hazardStatements;
	private String note;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChemicalFormula() {
		return chemicalFormula;
	}
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	public Double getDensity() {
		return density;
	}
	public void setDensity(Double density) {
		this.density = density;
	}
	public Double getAverageMeltingPoint() {
		return averageMeltingPoint;
	}
	public void setAverageMeltingPoint(Double averageMeltingPoint) {
		this.averageMeltingPoint = averageMeltingPoint;
	}
	public Double getAcidity() {
		return acidity;
	}
	public void setAcidity(Double acidity) {
		this.acidity = acidity;
	}
	public String getHazardStatements() {
		return hazardStatements;
	}
	public void setHazardStatements(String hazardStatements) {
		this.hazardStatements = hazardStatements;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
	

}
