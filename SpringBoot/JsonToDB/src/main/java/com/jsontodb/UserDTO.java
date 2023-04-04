package com.jsontodb;

public class UserDTO {

	private int id;
	private String email;
	private String first_name;

	public UserDTO() {
	
		
	}

	public UserDTO(int id, String email, String first_name) {
	
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
		return "UserDTO [id=" + id + ", email=" + email + ", first_name=" + first_name + "]";
	}

}
