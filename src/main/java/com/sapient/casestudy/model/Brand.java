
package com.sapient.casestudy.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor; import lombok.Data; import
lombok.NoArgsConstructor;

@Entity

public class Brand {
	
	
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Brand() {
		super();
	}
	@Id
	@GeneratedValue 
	private int id; 
	private String name;
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
	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + "]";
	} 
}
