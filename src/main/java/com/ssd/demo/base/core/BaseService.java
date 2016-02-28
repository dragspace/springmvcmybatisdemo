package com.ssd.demo.base.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T extends BaseEntity> {
	
	@Autowired
	private BaseMapper<T> baseMapper;
	
	public T getById(Long id){
		return this.baseMapper.selectByPrimaryKey(id);
	}

	public List<T> getAll(){
		return this.baseMapper.selectAll();
	}
	
	public void insert(T t){
		//设置创建人和操作人 时间
		
		this.baseMapper.insert(t);
	}
	
	public void updateById(T t){
		//操作人   时间
		this.baseMapper.updateByPrimaryKey(t);
	}
	
	public void deleteById(Long id){
		this.baseMapper.deleteByPrimaryKey(id);
	}
	
}
