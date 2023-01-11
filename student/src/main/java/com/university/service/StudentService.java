package com.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.university.entity.Student;
import com.university.feignclients.AddressFeignClient;
import com.university.repository.StudentRepository;
import com.university.request.StudentRequest;
import com.university.response.AddressResponse;
import com.university.response.StudentResponse;

import reactor.core.publisher.Mono;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	@Autowired
	WebClient webClient;

	@Autowired 
	AddressFeignClient  addressFeignClient;
	
	public StudentResponse createStudent(StudentRequest StudentRequest) {

		Student student = new Student();
		student.setFirstName(StudentRequest.getFirstName());
		student.setLastName(StudentRequest.getLastName());
		student.setEmail(StudentRequest.getEmail());
		
		student.setAddressId(StudentRequest.getAddressId());
		student = studentRepository.save(student);

StudentResponse studentResponse = new StudentResponse(student);
		

		//studentResponse.setAddressResponse(getAddressById(student.getAddressId()));

studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));



		return studentResponse;
		
	}
	
	
	
	public StudentResponse getById (long id) {
		Student student = studentRepository.findById(id).get();
		StudentResponse studentResponse = new StudentResponse(student);
		
		
	//	studentResponse.setAddressResponse(getAddressById(student.getAddressId()));
		
	
		studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));
		
		return studentResponse;
	}
	
	
	
	public AddressResponse getAddressById (long addressId) {
		Mono<AddressResponse> addressResponse = 
				webClient.get().uri("/getById/" + addressId)
		.retrieve().bodyToMono(AddressResponse.class);
		
		return addressResponse.block();
	}
}
