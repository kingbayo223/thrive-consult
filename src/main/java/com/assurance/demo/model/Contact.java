package com.assurance.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	 public Contact(){}
	public Contact(String fName, Long phone, String email, String country, String service) {
		super();
		this.fName = fName;
		this.phone = phone;
		this.email = email;
		this.country = country;
		this.service = service;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 @Column(name="fname")
	private String fName;
	 @Column(name="phone")
private long phone;
	 @Column(name="email")
private String email;
	 @Column(name="country")
private String country;
	 @Column(name="service")
private String service;
	 @Column(name="contactemail")
	 private String contactemail;
	public Contact(String contactemail) {
		super();
		this.contactemail = contactemail;
	}
	public String getContactemail() {
		return contactemail;
	}
	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

}
