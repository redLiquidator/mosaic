
package com.example.form;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptFormTests {

	@Autowired
	Validator validator;
	@Test
	public void test00_confirmValidator(){
		System.out.println("validator="+validator);
	}
	@Test
	public void test01_getdname(){
		DeptForm deptForm=new DeptForm();
		//cityForm.setName("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		BindingResult errors=new BeanPropertyBindingResult(deptForm,"cityForm");

		validator.validate(deptForm,errors);
		
		if(errors.hasErrors()){
			System.out.println("errors="+errors);
			return;
		}
		
		System.out.println("DeptForm은 유효합니다");
}
	
}
