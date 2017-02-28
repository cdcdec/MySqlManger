package com.cdc.mysqlmanger.object;

import java.sql.ResultSet;

/**
 * 进行查询的接口, 在DataFrame中使用
 */
public interface QueryObject {
	
	/**
	 * 得到数据
	 * @return
	 */
	ResultSet getDatas(String orderString);
	
	/**
	 * 得到查询的名称
	 * @return
	 */
	String getQueryName();
	
	/**
	 * 返回查询的SQL
	 * @return
	 */
	String getQuerySQL(String orderString);
	
}
