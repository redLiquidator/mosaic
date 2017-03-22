package com.example.form;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.domain.Dept;
import com.example.domain.Emp;

public class EmpForm extends Emp{

	@Override
	public Dept getDept() {
		// TODO Auto-generated method stub
		return super.getDept();
	}

	@Override
	public void setDept(Dept dept) {
		// TODO Auto-generated method stub
		super.setDept(dept);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Size(max=4)
	@Override
	public Integer getEmpno() {
		// TODO Auto-generated method stub
		return super.getEmpno();
	}

	@Override
	public void setEmpno(Integer empno) {
		// TODO Auto-generated method stub
		super.setEmpno(empno);
	}
	@NotNull
    @Digits(integer=10,fraction=0)
	@Override
	public String getEname() {
		// TODO Auto-generated method stub
		return super.getEname();
	}

	@Override
	public void setEname(String ename) {
		// TODO Auto-generated method stub
		super.setEname(ename);
	}
	
	@Digits(integer=9,fraction=0)
	@Override
	public String getJob() {
		// TODO Auto-generated method stub
		return super.getJob();
	}

	@Override
	public void setJob(String job) {
		// TODO Auto-generated method stub
		super.setJob(job);
	}
	@Size(max=4)
	@Override
	public Integer getMgr() {
		// TODO Auto-generated method stub
		return super.getMgr();
	}

	@Override
	public void setMgr(Integer mgr) {
		// TODO Auto-generated method stub
		super.setMgr(mgr);
	}
	@Digits(integer=5,fraction=2)
	@Override
	public BigDecimal getSal() {
		// TODO Auto-generated method stub
		return super.getSal();
	}

	@Override
	public void setSal(BigDecimal sal) {
		// TODO Auto-generated method stub
		super.setSal(sal);
	}
	@Digits(integer=5,fraction=2)
	@Override
	public BigDecimal getComm() {
		// TODO Auto-generated method stub
		return super.getComm();
	}

	@Override
	public void setComm(BigDecimal comm) {
		// TODO Auto-generated method stub
		super.setComm(comm);
	}
	@Digits(integer=3,fraction=0)
	@Override
	public Integer getDeptno() {
		// TODO Auto-generated method stub
		return super.getDeptno();
	}

	@Override
	public void setDeptno(Integer deptno) {
		// TODO Auto-generated method stub
		super.setDeptno(deptno);
	}


}
