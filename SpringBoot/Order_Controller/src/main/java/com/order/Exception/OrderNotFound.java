package com.order.Exception;

public class OrderNotFound extends RuntimeException{

	public OrderNotFound(String msg) {
		super(msg);
	}
}
