package com.example.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chungnhan")
public class ChungNhan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String manv;
	private String mamb;
	
	public ChungNhan() {
		super();
	}

	public ChungNhan(String manv, String mamb) {
		super();
		this.manv = manv;
		this.mamb = mamb;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getMamb() {
		return mamb;
	}

	public void setMamb(String mamb) {
		this.mamb = mamb;
	}
	
	
}
