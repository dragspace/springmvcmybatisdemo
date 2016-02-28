package com.ssd.demo.base.util;

import java.util.List;

import com.ssd.demo.base.core.BaseEntity;

public class ECUtil {

	public static <T extends BaseEntity> void insert(T t, String indexname, String mappingname){
		ECUtil.insert(t, indexname, mappingname, new ECIDGet<T>(){
			@Override
			public Object getId(T t) {
				return t.getId();
			}});
	}
	
	/**
	 * 单条插入
	 * @param t
	 * @param indexname 索引名称
	 * @param mappingname 
	 * @param ecIDGet  ec的id获取
	 */
	public static <T> void insert(T t, String indexname, String mappingname, ECIDGet<T> ecIDGet){
		
	}
	
	/**
	 * 批量插入
	 * @param t
	 * @param indexname
	 * @param mappingname
	 */
	public static <T extends BaseEntity> void batchInsert(List<T> t, String indexname, String mappingname){
		ECUtil.batchInsert(t, indexname, mappingname, new ECIDGet<T>(){
			@Override
			public Object getId(T t) {
				return t.getId();
			}});
	}
	
	/**
	 * 批量插入
	 * @param t
	 * @param indexname
	 * @param mappingname
	 * @param ecIDGet
	 */
	public static <T extends BaseEntity> void batchInsert(List<T> t, String indexname, String mappingname, ECIDGet<T> ecIDGet){
		
	}
	
	/**
	 * 获取ecId的抽象
	 * @author xiaoruihu
	 * @param <T>
	 */
	static interface ECIDGet<T>{
		public  Object getId(T t);
	}
	
	
}
