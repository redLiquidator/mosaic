package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.domain.Dept;
import com.example.domain.Emp;
import com.example.util.Pagination;

public interface DeptMapper {
	@Select("select count(*) from dept")
	int selectTotalCount();
	@Select("select*from dept")
	List<Dept> selectAll();
	List<Dept> selectAllWithEmp();
	@Select({
		"select*              ",
		"from dept             ",
		"order by deptno       ",
		"offset #{firstItem}-1 rows",
		"fetch next #{itemsPerPage} rows only"
	}) 
		
}
