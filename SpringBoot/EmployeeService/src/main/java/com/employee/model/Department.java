package com.employee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_id")
	private Integer id;
	private String name;
	private Long createdOn = new Date().getTime();
	private String createdBy;
	private Long updatedOn = new Date().getTime();
	private String updatedBy;
	
//	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
//	private List<Employee> employees;

}
