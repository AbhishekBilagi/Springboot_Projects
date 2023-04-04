package com.employee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	private String name;

	@Column(name = "dob")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String createdBy;
	private Long createdOn = new Date().getTime();
	private Long updatedOn = new Date().getTime();;
	private String updetedBy;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

}
