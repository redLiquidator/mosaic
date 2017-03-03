
--
-- Empolyee
--
select count(*) from dept;
select count(*) from emp;
select count(*) from bonus;
select count(*) from salgrade;

select * from dept;
select * from emp;
select * from bonus;
select * from salgrade;
--
-- World
--
select count(*) from country;
select count(*) from city;
select count(*) from countrylanguage;

select * from country  where code='KOR';
select * from city  where countrycode='USA';
select * from countrylanguage  where countrycode='USA';

select * from country;

drop table city;
drop table country;
create table country (
	code 			char(3 char),						
	name 			char(52 char),						
	continent		char(20 char)	default 'Asia',		
	region			char(26 char),						
	surface_area	number(10,2)	default '0.00',		
	indep_year		number(6),							
	population		number(11)		default 0,			
	life_expectancy	number(3,1),						
	gnp				number(10,2),
	gnp_old			number(10,2),
	local_name		char(45 char),						
	government_form	char(45 char),
	head_of_state	char(60 char)	default null,
	capital			number(11)		default null,
	code2			char(2  char),
	constraint ck_continent check (continent in ('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')),
	constraint pk_country primary key (code)
);


drop table city;
drop table countrylanguage;
/*
 * City
 */
create table city (
	id				number(11)		not null,
	name			char(35 char),
	country_code 	char(3 char),
	district		char(20 char),
	population		number(11)		default 0,
	constraint pk_city primary key (id),
	constraint fk_country foreign key (country_code) references country(code) 
);

/*
 * CountryLanguage
 */
create table country_language (
	country_code	char(3 char),
	language		char(30 char),
	is_official		char(1 char)		default 'F',
	percentage		number(4,1)			default '0.0',
	constraint ck_isofficial check (is_official in ('T','F')),
	constraint pk_country_language primary key (country_code, language)
);

select * from city;
select * from country_language;

-- private int empno;
-- 	private String ename;
-- 	private String job;
-- 	private BigDecimal mgr;
-- 	private Date hiredate;
-- 	private double sal;
-- 	private double comm;
-- 	private BigDecimal deptno;
select	d.deptno 	as dept_deptno,
		d.dname 	as dept_dname,
		d.loc		as dept_loc,
		e.empno		as emp_empno,
		e.ename		as emp_ename,
		e.job		as emp_job,
		e.mgr		as emp_mgr,
		e.hiredate	as emp_hiredate,
		e.sal		as emp_sal,
		e.comm		as emp_comm,
		e.deptno	as emp_deptno
  from dept d left outer join emp e
    on d.deptno = e.deptno;
	
--
--	냐라정보와 도시정보를 조회하는 쿼리
-- country && city
--
-- 	private String code;
-- 	private String name;
-- 	private String continent;
-- 	private String region;
-- 	private double surfaceArea;
-- 	private BigDecimal indepYear;
-- 	private BigDecimal population;
-- 	private double lifeExpectancy;
-- 	private double gnp;
-- 	private double gnpOld;
-- 	private String localName;
-- 	private String governmentForm;
-- 	private String headOfState;
-- 	private BigDecimal capital;
-- 	private String code2;
	
-- 	private int id;
-- 	private String name;
-- 	private String countryCode;
-- 	private String district;
-- 	private BigDecimal population;
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
 

create sequence test_seq;
drop sequence test_seq;
drop table test;
 create table test
 (
 	id number primary key,
	mydate date,
	mytimestamp timestamp,
	myblob blob,
	myblob2 blob
 );
 
 select * from test;
 
 insert into test values(test_seq.nextval, sysdate, sysdate);
 insert into test (id, mydate) values(test_seq.nextval, sysdate);
 insert into test (id, mytimestamp) values(test_seq.nextval, sysdate);
 
		
select *
  from country
offset 1 * 10 row
 fetch next 2*10 rows only;
 
 
 
  
  	
	
	
	
	
	
	
	
	







