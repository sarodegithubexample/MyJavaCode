package com.test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
    @Column(name="firstName")
    private String fristName;
    
    @Column(name="mobileNumber")
    private String mobileNumber;
    @OneToOne(targetEntity = Transection.class, cascade = CascadeType.ALL)
	private Transection transactions;


	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getFristName() {
		return fristName;
	}

	
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	
	public String getMobileNumber() {
		return mobileNumber;
	}

	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setTransactions(Transection transactions) {
		this.transactions = transactions;
	}
	public Transection getTransactions() {
		return transactions;
	}


	
		
	}


	
	
    

