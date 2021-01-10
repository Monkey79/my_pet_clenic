package com.mdangelo.petclinic.services;

import com.mdangelo.petclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	Owner findByLastName(String lastName);

}
