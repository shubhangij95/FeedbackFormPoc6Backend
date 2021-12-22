package com.neosoft.task6.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.task6.main.model.Catogories;
import com.neosoft.task6.main.serviceImpl.FeedbackServiceImpl;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	FeedbackServiceImpl fsi;
	
	@PostMapping("/savedata")
	public String saveCategory(@RequestBody Catogories catogories)
	{
		fsi.registerData(catogories);
		
		return "data saved succefully";
	}
	
	
	@GetMapping("/getdata")
	public List<Catogories> getCategory()
	{
		List<Catogories> list=fsi.getData();
		
		return list;
	}

}
