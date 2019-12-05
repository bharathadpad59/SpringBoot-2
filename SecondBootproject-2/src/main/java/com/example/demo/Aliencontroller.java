package com.example.demo;


import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Alienclass;
import com.sun.xml.fastinfoset.sax.Properties;

@Controller
public class Aliencontroller {

	Alienclass alien=new Alienclass();
	@Autowired
	Repository repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "firstpage";
	}
	
	

	@RequestMapping (value="/aliendataadd")
	public String controllermethod(@RequestParam int id,@RequestParam String name)
	{
		System.out.println("Rededited by me after cloning");
		System.out.println(alien.getAid());
		alien.getAname();
		alien.getAtech();
		repo.save(alien);
		System.out.println("value to check" +alien.getAid());
		return "firstpage";
		
	}

}
