package com.sprink.api.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;

@Entity
@Data
public class MenuItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	private double price;
	private MenuItemType type;
	private CuisineType cusin;
	private MealSession mealSession;
	private PortionSize portionSize;
	private String createdBy;
	private LocalDateTime createdTime;
	//private  CreatedTime=new Date().getTime();;
	private String updatedBy;
	private LocalDateTime updatedTime;
	
	
}
