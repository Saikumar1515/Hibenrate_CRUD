package com.tek.mapping.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class onetooneUniCar {
	
	@Id
	private int id;
	private String name;
	private double cost;
	
	@OneToOne
	private OnetoOneUniEngine engine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public OnetoOneUniEngine getEngine() {
		return engine;
	}

	public void setEngine(OnetoOneUniEngine engine) {
		this.engine = engine;
	}

}
