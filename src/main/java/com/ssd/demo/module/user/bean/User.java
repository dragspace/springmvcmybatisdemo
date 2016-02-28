package com.ssd.demo.module.user.bean;

import javax.persistence.Column;
import javax.persistence.Table;

import com.ssd.demo.base.core.BaseEntity;

@Table
public class User extends BaseEntity{
	
	@Column
	private String name;
	
	@Column
	private String detail;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
