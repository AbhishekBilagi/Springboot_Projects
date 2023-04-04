package com.order.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Entity
@Table(name="Order_API")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull(message="Name is mandatory")
	private String name;
	private LocalDateTime orderDate=LocalDateTime.now();
	private int quantity;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, @NotNull(message = "Name is mandatory") String name, LocalDateTime orderDate, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.orderDate = orderDate;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", orderDate=" + orderDate + ", quantity=" + quantity + "]";
	}
}
