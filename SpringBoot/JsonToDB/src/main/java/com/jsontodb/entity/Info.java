package com.jsontodb.entity;

import java.util.List;

import lombok.Data;

@Data
public class Info {

	private List<Users> data;

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Info(List<Users> data) {
		super();
		this.data = data;
	}

	public List<Users> getData() {
		return data;
	}

	public void setData(List<Users> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Info [data=" + data + "]";
	}

}
