package com.tek.mapping.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OnetoOneUniEngine {
	
	@Id
	private int id;
	private String type;
	private int cc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	

}
