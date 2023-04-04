package com.contact.model;

import javax.persistence.*;

@Entity
@Table(name="Contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private  String phone;
	
	@Column(name="birthday")
	private  String birthday;
	
	@Column(name="website")
	private  String website ;
	
	@Column(name="image")
	private String image;
	
	 @Embedded
	private Address address;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(int id, String name, String email, String phone, String birthday, String website, String image,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
		this.website = website;
		this.image = image;
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", birthday="
				+ birthday + ", website=" + website + ", image=" + image + ", address=" + address + "]";
	}
	
	
	

}
