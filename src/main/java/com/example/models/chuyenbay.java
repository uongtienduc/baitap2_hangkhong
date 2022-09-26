package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chuyenbay")
public class chuyenbay implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String macb;
	@Column(length =100)
	private String gadi;
	private String gaden;
	private String dodai;
	private String giodi;
	private String gioden;
	private Integer chiphi;
	
	
	
	public chuyenbay() {
		super();
	}
	public chuyenbay(String macb, String gadi, String gaden, String dodai, String giodi, String gioden,
			Integer chiphi) {
		super();
		this.macb = macb;
		this.gadi = gadi;
		this.gaden = gaden;
		this.dodai = dodai;
		this.giodi = giodi;
		this.gioden = gioden;
		this.chiphi = chiphi;
	}
	public String getMacb() {
		return macb;
	}
	public void setMacb(String macb) {
		this.macb = macb;
	}
	public String getGadi() {
		return gadi;
	}
	public void setGadi(String gadi) {
		this.gadi = gadi;
	}
	public String getGaden() {
		return gaden;
	}
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	public String getDodai() {
		return dodai;
	}
	public void setDodai(String dodai) {
		this.dodai = dodai;
	}
	public String getGiodi() {
		return giodi;
	}
	public void setGiodi(String giodi) {
		this.giodi = giodi;
	}
	public String getGioden() {
		return gioden;
	}
	public void setGioden(String gioden) {
		this.gioden = gioden;
	}
	public Integer getChiphi() {
		return chiphi;
	}
	public void setChiphi(Integer chiphi) {
		this.chiphi = chiphi;
	}
	
	
	
}
