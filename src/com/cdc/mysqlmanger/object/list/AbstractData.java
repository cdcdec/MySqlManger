package com.cdc.mysqlmanger.object.list;


import com.cdc.mysqlmanger.object.ViewObject;

/**
 * 数据列表的抽象类
 */
public abstract class AbstractData implements ViewObject {
	
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String toString();
}
