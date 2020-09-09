package com.qtshop.app.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author jayant
 *
 */

@Document
public class Users implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1385794955661915701L;
	
	@Id
	private String id;

	
	private String emailId;
	
	private Date lastLoginDate;

	
	private Date dob;

	
	private String firstName;

	
	private String lastName;

	
	private String initials;

	
	private String supervisorId;

	
	private Boolean isActive;
	
	@JsonIgnore
	private String pwd;
	
	
	private String city;
	
	
	private String country;
	
	
	private String countryCode;
	
	
	private String phone;
	
	
	private String address;
	
	
	private String pincode;
	
	
	private String vendorId;

	
	private String vendorName;
	
	
	private String deviceToken;
	
	
	private Date createdAt;
	
	
	private Date validationDate;
	
	private String activationCode;
	
	private String userType;
	@JsonIgnore
	private String adminPass;
	
	public String  getId() {
		return id;
	}

	public void setId(String  id) {
		this.id = id;
	}

	public Users() {
		super();
	}

	public Users(String emailId, String firstName, String lastName,String phoneNo) {
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phoneNo;
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getDisplayName() {
		return null != initials ?  initials +" "+ lastName + "," + firstName : lastName + "," + firstName;
	}

	public void setDisplayName(String displayName) {
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}


	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the vendorId
	 */
	public String getVendorId() {
		return vendorId;
	}

	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}

	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	/**
	 * @return the deviceToken
	 */
	public String getDeviceToken() {
		return deviceToken;
	}

	/**
	 * @param deviceToken the deviceToken to set
	 */
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the activationCode
	 */
	public String getActivationCode() {
		return activationCode;
	}

	/**
	 * @param activationCode the activationCode to set
	 */
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	/**
	 * @return the validationDate
	 */
	public Date getValidationDate() {
		return validationDate;
	}

	/**
	 * @param validationDate the validationDate to set
	 */
	public void setValidationDate(Date validationDate) {
		this.validationDate = validationDate;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the adminPwd
	 */
	public String getAdminPwd() {
		return adminPass;
	}

	/**
	 * @param adminPwd the adminPwd to set
	 */
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "USER_ROLE_ID") private UserRole userRole;
	 */
}
