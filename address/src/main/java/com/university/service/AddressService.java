package com.university.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entity.Address;
import com.university.repository.AddressRepository;
import com.university.request.AddressRequest;
import com.university.response.AddressResponse;

@Service
public class AddressService {

Logger logger = LoggerFactory.getLogger(AddressService.class);
	
	@Autowired
	AddressRepository addressRepository; 
	
public AddressResponse createAddress(AddressRequest AddressRequest) {
		
		Address address = new Address();
		address.setStreet(AddressRequest.getStreet());
		address.setCity(AddressRequest.getCity());
		
		addressRepository.save(address);
		
		return new AddressResponse(address);
		
	}
	
public AddressResponse getById (long id) {
	
	logger.info("Inside getById " + id);
	
	Address address = addressRepository.findById(id).get();
	
	return new AddressResponse(address);
}

}
