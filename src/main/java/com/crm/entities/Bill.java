package com.crm.entities;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.*;

@Entity
@Table(name = "bills")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", length = 45, nullable = false)
	private String firstName;
	
	@Column(name="last_name", length = 45, nullable = false)
	private String lastName;
	
	@Column(name="email", length = 128, nullable = false, unique = false)
	private String email;
	
	@Column(name="mobile", length = 10, nullable = false, unique = false)
	private long mobile;
	
	@Column(name="model", length = 128, nullable = false)
	private String model;
	
	@Column(name="amount", nullable = false)
	private int amount;
	
	@CreatedDate
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;

	public Date getDate() {
		return date;
	}

	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
}

