package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Molecule;
import com.example.domain.Molecule;
import com.example.util.Pagination;

@Mapper
public interface MoleculeMapper {

	/*
	 * Select
	 */
	@Select("select count(*) from molecule")
	int selectTotalCount();
	   
	@Select("select * from molecule")
	List<Molecule> selectAll();
	List<Molecule> selectAllWithMass();
	
	@Select({
		"select *                ",
		"  from molecule             ",
		" order by name            ",
		" offset #{firstItem} - 1 rows   ",
		" fetch next #{itemsPerPage} rows only"
	})
	List<Molecule> selectPage(Pagination paging);
	List<Molecule> selectPageWithMass(Pagination paging);
	
	@Select("select * from molecule where chemical_formula=#{chemicalFormula}")
	Molecule selectByFormula(String chemicalFormula);
	Molecule selectByFormulaWithMass(String chemicalFormula);
	
	/*
	 * Insert
	 */
	int insert(Molecule molecule);
	/*
	 * Update
	 */
	int updateById(Molecule molecule);
	
	/*
	 * Delete
	 */
	@Delete("delete from molecule where chemical_formula=#{chemicalFormula}")
	int deleteByFormula(String chemicalFormula);
	
	
}
