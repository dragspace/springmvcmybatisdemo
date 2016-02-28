package com.ssd.demo.module.document.bean;

import javax.persistence.Column;
import javax.persistence.Table;

import com.ssd.demo.base.core.BaseEntity;

@Table
public class Document extends BaseEntity {

	@Column
	private String title;
	@Column
	private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
