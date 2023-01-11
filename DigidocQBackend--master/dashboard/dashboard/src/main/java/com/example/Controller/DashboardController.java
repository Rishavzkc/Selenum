package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Entity.Dashboard;
import com.example.Repository.DashboardRepository;


//Controller class
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/dashboard")

public class DashboardController {

	@Autowired
	DashboardRepository dashboardRepository;
	
	@GetMapping("/layouts")  //(get method for getting data from db)
	public List<Dashboard>layouts(){
		try {
		List<Dashboard>layoutlist=dashboardRepository.findAll();
		
		System.out.println(layoutlist);
		
		return layoutlist;
	}
		catch (Exception e) {
		}
		return null;
		}
	}

