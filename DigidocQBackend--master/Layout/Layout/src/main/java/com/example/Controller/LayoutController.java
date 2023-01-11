package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.*;
import com.example.Service.LayoutService;


//Controller class
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/layout")
public class LayoutController {
	
	@Autowired
	private LayoutService layoutService;

	@PostMapping("/createlayout") //(post method for creating layout)
	public Layout saveLayout(@RequestBody Layout layout){
		return layoutService.saveLayout(layout);
	}
}
