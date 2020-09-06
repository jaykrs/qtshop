package com.qtshop.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LookUp {

	@Id
	private int lookUpId;
	
	private String lookUpName;
	
	private String lookUpLabel;
	
	private int lookUpTypeId;

	private boolean isActive;
	
	private boolean isDeleted;
	/**
	 * @return the lookUpId
	 */
	public int getLookUpId() {
		return lookUpId;
	}

	/**
	 * @param lookUpId the lookUpId to set
	 */
	public void setLookUpId(int lookUpId) {
		this.lookUpId = lookUpId;
	}

	/**
	 * @return the lookUpName
	 */
	public String getLookUpName() {
		return lookUpName;
	}

	/**
	 * @param lookUpName the lookUpName to set
	 */
	public void setLookUpName(String lookUpName) {
		this.lookUpName = lookUpName;
	}

	/**
	 * @return the lookUpLabel
	 */
	public String getLookUpLabel() {
		return lookUpLabel;
	}

	/**
	 * @param lookUpLabel the lookUpLabel to set
	 */
	public void setLookUpLabel(String lookUpLabel) {
		this.lookUpLabel = lookUpLabel;
	}

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
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isDeleted
	 */
	public boolean isDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	
}
