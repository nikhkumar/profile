package com.mycomp.profile.model;

public class Profile {

	private int id;
	private String fName;
	private String lName;
	private Address shippingAddress;
	private Address billingAddress;
	
	public Profile() {}
	
	public Profile(int id, String fName, String lName, Address shippingAddress, Address billingAddress) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
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

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	};
	
	
}
