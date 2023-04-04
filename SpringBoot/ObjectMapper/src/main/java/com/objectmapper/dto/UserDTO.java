package com.objectmapper.dto;

public class UserDTO {

	private Integer id;
	private String first_name;
	private String email;


	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserDTO(Integer id, String first_name, String email) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", first_name=" + first_name + ", email=" + email + "]";
	}

	

	
	
	

}
