package com.qtshop.app.entity;

import java.io.Serializable;
import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class LookUpType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private BigInteger lookUpTypeId;
	
	private String lookUpTypeName;
	
	private String lookUpTypeLabel;

	/**
	 * @return the lookUpTypeId
	 */
	public BigInteger getLookUpTypeId() {
		return lookUpTypeId;
	}

	/**
	 * @param lookUpTypeId the lookUpTypeId to set
	 */
	public void setLookUpTypeId(BigInteger lookUpTypeId) {
		this.lookUpTypeId = lookUpTypeId;
	}

	/**
	 * @return the lookUpTypeName
	 */
	public String getLookUpTypeName() {
		return lookUpTypeName;
	}

	/**
	 * @param lookUpTypeName the lookUpTypeName to set
	 */
	public void setLookUpTypeName(String lookUpTypeName) {
		this.lookUpTypeName = lookUpTypeName;
	}

	/**
	 * @return the lookUpTypeLabel
	 */
	public String getLookUpTypeLabel() {
		return lookUpTypeLabel;
	}

	/**
	 * @param lookUpTypeLabel the lookUpTypeLabel to set
	 */
	public void setLookUpTypeLabel(String lookUpTypeLabel) {
		this.lookUpTypeLabel = lookUpTypeLabel;
	}

}
