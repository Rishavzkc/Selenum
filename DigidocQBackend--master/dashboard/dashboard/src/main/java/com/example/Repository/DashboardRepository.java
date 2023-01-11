package com.example.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.Entity.Dashboard;


//Repository class
@Repository
public interface DashboardRepository extends CrudRepository <Dashboard,Integer>{
	
	//method to list all content 
	public List<Dashboard>findAll();

}