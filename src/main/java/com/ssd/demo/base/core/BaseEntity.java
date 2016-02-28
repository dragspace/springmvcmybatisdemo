package com.ssd.demo.base.core;

import javax.persistence.Id;

public class BaseEntity extends ToStringBean{

	@Id
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
