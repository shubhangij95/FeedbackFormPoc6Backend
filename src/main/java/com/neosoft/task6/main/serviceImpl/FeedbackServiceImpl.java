package com.neosoft.task6.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.task6.main.model.Catogories;
import com.neosoft.task6.main.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl
{
	@Autowired
	FeedbackRepository repo;
	
	public void registerData(Catogories catogories)
	{
		repo.save(catogories);
	}
	
	
	public List<Catogories> getData()
	{
		List<Catogories> list=repo.findAll();
		return list;
		
	}


}
