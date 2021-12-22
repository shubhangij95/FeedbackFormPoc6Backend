package com.neosoft.task6.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.task6.main.model.Catogories;

@Repository
public interface FeedbackRepository extends JpaRepository<Catogories, Integer>
{
	
	

}
