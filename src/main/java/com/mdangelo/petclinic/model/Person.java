package com.mdangelo.petclinic.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = 2989553519802473580L;
	
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	

}
