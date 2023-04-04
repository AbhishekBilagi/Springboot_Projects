package com.contact.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {
  
	@Column (name="street")
	private String street;
	@Column (name="zip")
	private String zip;
	@Column (name="city")
	private String city;
	@Column (name="country")
	private String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String zip, String city, String country) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + ", city=" + city + ", country=" + country + "]";
	}
	
}
