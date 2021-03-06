package com.turborep.turbotracker.customer.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cumastertype generated by hbm2java
 */
@Entity
@Table(name = "cuMasterType", catalog = "")
public class CuMasterType implements java.io.Serializable {

	private Integer cuMasterTypeId;
	private String code;
	private String description;
	private Boolean inActive;

	public CuMasterType() {
	}

	public CuMasterType(String code, String description, Boolean inActive) {
		this.code = code;
		this.description = description;
		this.inActive = inActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cuMasterTypeID", unique = true, nullable = false)
	public Integer getCuMasterTypeId() {
		return this.cuMasterTypeId;
	}

	public void setCuMasterTypeId(Integer cuMasterTypeId) {
		this.cuMasterTypeId = cuMasterTypeId;
	}

	@Column(name = "Code", length = 6)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "Description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "InActive")
	public Boolean getInActive() {
		return this.inActive;
	}

	public void setInActive(Boolean inActive) {
		this.inActive = inActive;
	}

}
