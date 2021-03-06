package com.turborep.turbotracker.employee.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Epempearning generated by hbm2java
 */
@Entity
@Table(name = "epempearning", catalog = "")
public class Epempearning implements java.io.Serializable {

	private Integer epEmpEarningId;
	private Integer rxMasterId;
	private Integer epCoEarningId;
	private Boolean active;
	private BigDecimal amount;

	public Epempearning() {
	}

	public Epempearning(Integer rxMasterId, Integer epCoEarningId,
			Boolean active, BigDecimal amount) {
		this.rxMasterId = rxMasterId;
		this.epCoEarningId = epCoEarningId;
		this.active = active;
		this.amount = amount;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "epEmpEarningID", unique = true, nullable = false)
	public Integer getEpEmpEarningId() {
		return this.epEmpEarningId;
	}

	public void setEpEmpEarningId(Integer epEmpEarningId) {
		this.epEmpEarningId = epEmpEarningId;
	}

	@Column(name = "rxMasterID")
	public Integer getRxMasterId() {
		return this.rxMasterId;
	}

	public void setRxMasterId(Integer rxMasterId) {
		this.rxMasterId = rxMasterId;
	}

	@Column(name = "epCoEarningID")
	public Integer getEpCoEarningId() {
		return this.epCoEarningId;
	}

	public void setEpCoEarningId(Integer epCoEarningId) {
		this.epCoEarningId = epCoEarningId;
	}

	@Column(name = "Active")
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "Amount", scale = 4)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
