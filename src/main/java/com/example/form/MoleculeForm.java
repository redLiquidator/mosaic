package com.example.form;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.domain.City;
import com.example.domain.Molecule;

public class MoleculeForm extends Molecule{
	
	public void setMolecule(Molecule molecule){
		super.setName(molecule.getName());
		super.setChemicalFormula(molecule.getChemicalFormula());
		super.setDensity(molecule.getDensity());
		super.setAverageMeltingPoint(molecule.getAverageMeltingPoint());
		super.setSolubilityInWater(molecule.getSolubilityInWater());
		super.setAcidity(molecule.getAcidity());
		super.setHazardStatements(molecule.getHazardStatements());
		super.setNote(molecule.getNote());
	}

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
	
	@Size(max=15)
	@Override
	public String getChemicalFormula() {
		// TODO Auto-generated method stub
		return super.getChemicalFormula();
	}

	@Override
	public void setChemicalFormula(String chemicalFormula) {
		if(chemicalFormula.equals(""))
			chemicalFormula=null;
		super.setChemicalFormula(chemicalFormula);
	}
	
	@Digits(integer=9,fraction=4)
	@Override
	public Double getDensity() {
		// TODO Auto-generated method stub
		return super.getDensity();
	}
	
	@Override
	public void setDensity(Double density) {
		if(density.equals(""))
			density = null;
		super.setDensity(density);
	}
	@Digits(integer=9,fraction=4)
	@Override
	public Double getAverageMeltingPoint() {
		// TODO Auto-generated method stub
		return super.getAverageMeltingPoint();
	}

	@Override
	public void setAverageMeltingPoint(Double averageMeltingPoint) {
		// TODO Auto-generated method stub
		super.setAverageMeltingPoint(averageMeltingPoint);
	}
	
	@Digits(integer=9,fraction=4)
	@Override
	public Double getSolubilityInWater() {
		// TODO Auto-generated method stub
		return super.getSolubilityInWater();
	}

	@Override
	public void setSolubilityInWater(Double solubilityInWater) {
		// TODO Auto-generated method stub
		super.setSolubilityInWater(solubilityInWater);
	}
	
	@Digits(integer=9,fraction=4)
	@Override
	public Double getAcidity() {
		// TODO Auto-generated method stub
		return super.getAcidity();
	}

	@Override
	public void setAcidity(Double acidity) {
		// TODO Auto-generated method stub
		super.setAcidity(acidity);
	}
	
	@Size(max=35)
	@Override
	public String getHazardStatements() {
		// TODO Auto-generated method stub
		return super.getHazardStatements();
	}

	@Override
	public void setHazardStatements(String hazardStatements) {
		if(hazardStatements.equals(""))
			hazardStatements=null;
		super.setChemicalFormula(hazardStatements);
	}
	
	@Size(max=25)
	@Override
	public String getNote() {
		// TODO Auto-generated method stub
		return super.getHazardStatements();
	}

	@Override
	public void setNote(String note) {
		if(note.equals(""))
			note=null;
		super.setNote(note);
	}
	
	
	

}
