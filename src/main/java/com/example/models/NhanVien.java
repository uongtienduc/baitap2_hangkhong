package com.example.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="nhanvien")
public class NhanVien implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String manv;
	@Column(length =100)
	private String ten;
	private Integer luong;
	
	
	
	public NhanVien() {
		super();
	}

	public NhanVien(String manv, String ten, Integer luong) {
		super();
		this.manv = manv;
		this.ten = ten;
		this.luong = luong;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Integer getLuong() {
		return luong;
	}

	public void setLuong(Integer luong) {
		this.luong = luong;
	}
	
	
}
