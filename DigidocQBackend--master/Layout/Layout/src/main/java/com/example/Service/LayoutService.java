package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Layout;
import com.example.Repository.LayoutRepository;


//service class
@Service
public class LayoutService {

	@Autowired
	private LayoutRepository layoutRepository;
	
	
	//method to save layout
	public Layout saveLayout(Layout layout) {
		return layoutRepository.save(layout);
	}
	
}
