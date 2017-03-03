package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HiddenController {
	
	@RequestMapping(value="/hidden2", method=RequestMethod.POST)
	@ResponseBody
	public void post(String id, String name) {
		System.out.println("############");
		System.out.println("doPost().....");
		System.out.println("############");
		System.out.println("id=" + id);
		System.out.println("name=" + name);
	}
	
	@RequestMapping(value="/hidden2", method=RequestMethod.PUT)
	@ResponseBody
	public void put(String id, String name) {
		System.out.println("############");
		System.out.println("doPut().....");
		System.out.println("############");
		System.out.println("id=" + id);
		System.out.println("name=" + name);
	}

}
