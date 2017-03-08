select count(*) from emp;

select table_name from user_tables;

select	e.empno		as emp_empno,
		e.ename		as emp_ename,
		e.job		as emp_job,
		e.mgr		as emp_mgr,
		e.hiredate	as emp_hiredate,
		e.sal		as emp_sal,
		e.comm		as emp_comm,
		e.deptno	as emp_deptno,
		d.deptno 	as dept_deptno,
		d.dname 	as dept_dname,
		d.loc		as dept_loc
  from emp e left outer join dept d
    on e.deptno = d.deptno;
	
select 	c1.id				as city_id,
		c1.name				as city_name,
		c1.country_code		as city_country_code,
		c1.district			as city_district,
		c1.population		as city_population,
		c2.code				as country_code,
		c2.name				as country_name,
		c2.continent		as country_continent,
		c2.region			as country_region,
		c2.surface_area		as country_surface_area,
		c2.indep_year		as country_indep_year,
		c2.population		as country_population,
		c2.life_expectancy	as country_life_expectancy,
		c2.gnp				as country_gnp,
		c2.gnp_old			as country_gnp_old,
		c2.local_name		as country_local_name,
		c2.government_form	as country_government_form,
		c2.head_of_state	as country_head_of_state,
		c2.capital			as country_capital,
		c2.code2			as country_code2
  from city c1 left outer join country c2
	on c1.country_code = c2.code
	 where c1.country_code = 'KOR';	
	 
--
-- City Paging
--
select count(*) from city;


select *
  from city
 order by id  
offset 40 rows
 fetch next 10 rows only; 
  	 
	select 	c1.code				as country_code,
			c1.name				as country_name,
			c1.continent		as country_continent,
			c1.region			as country_region,
			c1.surface_area		as country_surface_area,
			c1.indep_year		as country_indep_year,
			c1.population		as country_population,
			c1.life_expectancy	as country_life_expectancy,
			c1.gnp				as country_gnp,
			c1.gnp_old			as country_gnp_old,
			c1.local_name		as country_local_name,
			c1.government_form	as country_government_form,
			c1.head_of_state	as country_head_of_state,
			c1.capital			as country_capital,
			c1.code2			as country_code2,
			c2.id				as city_id,
			c2.name				as city_name,
			c2.country_code		as city_country_code,
			c2.district			as city_district,
			c2.population		as city_population
	  from country c1 left outer join city c2
	    on c1.code = c2.country_code
	 where c1.code = 'KOR';	 
	 
	 
 select count(*)
   from city
  where country_code = 'KOR';
  
  --
  -- selectPage
  --
  select *
    from city
--    where country_code = 'KOR'
  order by id 
  offset 2 rows
   fetch next 3 rows only;
  
  --
  -- selectPageWithCountry
  -- 
  select *
    from city c1 left outer join country c2
	  on c1.country_code = c2.code
--    where c1.country_code = 'KOR'
  order by id 
  offset 2 rows
   fetch next 3 rows only;
	   
--
-- CountryMapper.selectPage 
--
select *
  from country
 order by code  
offset 2 rows
 fetch next 3 rows only;
 
select *
  from city
 where country_code = 'AGO';
 
select *
  from city
 where country_code = 'AIA';
 
select *
  from city
 where country_code = 'ALB'; 
 
select code 
  from country
offset 0 rows
 fetch next 10 rows only;  
 
    
	   
--
-- CountryMapper.selectPageWithCity 
--
select *
  from country c1 left outer join city c2
    on c1.code = c2.country_code
 order by c1.code  
offset 2 rows
 fetch next 3 rows only;		   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 