package com.example.models;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maybay")
public class MayBay implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mamb;
	private String loai;
	private String tambay;
	
	public MayBay() {
		super();
	}

	public MayBay(Integer mamb, String loai, String tambay) {
		super();
		this.mamb = mamb;
		this.loai = loai;
		this.tambay = tambay;
	}

	public Integer getMamb() {
		return mamb;
	}

	public void setMamb(Integer mamb) {
		this.mamb = mamb;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getTambay() {
		return tambay;
	}

	public void setTambay(String tambay) {
		this.tambay = tambay;
	}
	
	
}
