package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.*;
import com.example.Repository.LoginRepository;
//Controller class

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginRepository userRepository;
	
	
	
	@PostMapping("/loginUser") //(Post mapping for verify data from DB)
	
	public ResponseEntity<?> loginUser(@RequestBody Login userData){
		
		System.out.println(userData);
		Login user=userRepository.findByEmail(userData.getEmail());
		if(user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		
		
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
	
		}
}
