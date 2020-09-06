package com.qtshop.app.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class LookUpType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int lookUpTypeId;
	
	private String lookUpTypeName;
	
	private String lookUpTypeLabel;

	/**
	 * @return the lookUpTypeId
	 */
	public int getLookUpTypeId() {
		return lookUpTypeId;
	}

	/**
	 * @param lookUpTypeId the lookUpTypeId to set
	 */
	public void setLookUpTypeId(int lookUpTypeId) {
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
