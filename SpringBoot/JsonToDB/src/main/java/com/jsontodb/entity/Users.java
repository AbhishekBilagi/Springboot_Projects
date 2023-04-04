package com.jsontodb.entity;

import javax.persistence.*;

@Entity
public class Users {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email;
	private String first_name;
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String email, String first_name) {
		super();
		this.id = id;
		this.email = email;
		this.first_name = first_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", first_name=" + first_name + "]";
	}
	
}
