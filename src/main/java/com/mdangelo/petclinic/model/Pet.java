package com.mdangelo.petclinic.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Pet implements Serializable{
	private static final long serialVersionUID = 8936392731770273380L;
	
	
	private LocalDate birthDate;
	private PetType type;
	private Owner owner;
	
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
