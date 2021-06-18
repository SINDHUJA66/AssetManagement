package com.asset.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "asset_request")
	public class Allocation {
	@Id
	private Long aid;
	private int allocation_date;
	private String status;
	public Allocation(Long aid, int allocation_date, String status) {
		super();
		this.aid = aid;
		this.allocation_date = allocation_date;
		this.status = status;
	}
	public Allocation() {
		super();
		
	}
	public Long getAid() {
		return aid;
	}
	public void setAid(Long aid) {
		this.aid = aid;
	}
	public int getAllocation_date() {
		return allocation_date;
	}
	public void setAllocation_date(int allocation_date) {
		this.allocation_date = allocation_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Allocation [aid=" + aid + ", allocation_date=" + allocation_date + ", status=" + status + "]";
	}
	
}
