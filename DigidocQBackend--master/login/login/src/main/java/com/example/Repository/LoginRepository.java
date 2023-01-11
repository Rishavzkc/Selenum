package com.example.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Login;

//Repository class
@Repository
public interface LoginRepository extends CrudRepository <Login, String>{

	//Method to find id by email
	Login findByEmail(String email);
}
