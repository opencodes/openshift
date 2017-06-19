package com.rkjha.sm.model;

public class SocietyInfoModel {
	
	private int infoId;
	private String registeredName;
	private String aliasName;
	private String street;
	private String locality;
	private String city;
	private String state;
	private int SocietyId;
	


	public SocietyInfoModel() {
		// TODO Auto-generated constructor stub
	}

	public int getInfoId() {
		return infoId;
	}

	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}

	public String getRegisteredName() {
		return registeredName;
	}

	public void setRegisteredName(String registeredName) {
		this.registeredName = registeredName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getSocietyId() {
		return SocietyId;
	}

	public void setSocietyId(int societyId) {
		SocietyId = societyId;
	}

	
}
