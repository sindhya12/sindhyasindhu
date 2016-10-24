package com.pick.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="USER")

public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String FirstName;
	private String LastName;
	private String email;
	
public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}


public String toString(){
	return "[Firstname=   "+FirstName+",Lastname=" + LastName + "]";
}
}

