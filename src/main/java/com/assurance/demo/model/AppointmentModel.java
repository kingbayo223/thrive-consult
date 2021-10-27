package com.assurance.demo.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Appointment")
public class AppointmentModel {
	
	  public AppointmentModel(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public AppointmentModel(String fName, String mName, String lName, long phone, String email, Date date) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.phone = phone;
		this.email = email;
		this.date = date;
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
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name="fName")
	private String fName;
	@Column(name="mName")
	private String mName;
	@Column(name="lName")
	private String lName;
	@Column(name="phone")
    private long phone;
    @Column(name="email")
    private String email;
    @Column(name="date")
    private Date date ;
    public AppointmentModel(String service, double amount) {
		super();
		this.service = service;
		this.amount = amount;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public double getAmount() {
		return amount;
	}
	

	@Column(name="service")
    private String service ;
    @Column(name="amount")
    private double amount ;
    public AppointmentModel(String link) {
		super();
		this.link = link;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	@Column(name="link")
    private String link ;
    
    //how to create current date in angular app
   // @Temporal(TemporalType.TIMESTAMP)
    //@Column(nullable=false)
    //private Date LastUpdate;
    //@PrePersist
    //private void onCreate()
   //{
   //LastUpdate = new Date();
   //}
}
