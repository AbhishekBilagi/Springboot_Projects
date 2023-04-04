package com.objectmapper.dto;

import java.util.List;

public class Info {
	
	List<UserDTO> data;

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Info(List<UserDTO> data) {
		super();
		this.data = data;
	}

	public List<UserDTO> getData() {
		return data;
	}

	public void setData(List<UserDTO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Info [data=" + data + "]";
	}
	
	

}
