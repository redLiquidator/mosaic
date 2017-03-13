package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.City;
import com.example.util.Pagination;

@Mapper
public interface CityMapper {

	/*
	 * Select
	 */
	@Select("select count(*) from city")
	int selectTotalCount();
	
	@Select("select * from city")
	List<City> selectAll();
	List<City> selectAllWithCountry();
	
	@Select({
		"select *                ",
		"  from city             ",
		" order by id            ",
		"offset #{firstItem} - 1 rows   ",
		" fetch next #{itemsPerPage} rows only"
	})
	List<City> selectPage(Pagination paging);
	List<City> selectPageWithCountry(Pagination paging);
	
	@Select("select * from city where id=#{id}")
	City selectById(int id);
	City selectByIdWithCountry(int id);
	
	/*
	 * Insert
	 */
	int insert(City city);
	/*
	 * Update
	 */
	int updateById(City city);
	
	/*
	 * Delete
	 */
	@Delete("delete from city where id=#{id}")
	int deleteById(int id);
	
	
}
