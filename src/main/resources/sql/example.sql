
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