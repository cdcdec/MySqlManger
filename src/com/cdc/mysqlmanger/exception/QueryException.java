package com.cdc.mysqlmanger.exception;

/**
 * 查询异常
 */
public class QueryException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -636996326670090109L;

	public QueryException(String s) {
		super(s);
	}
}