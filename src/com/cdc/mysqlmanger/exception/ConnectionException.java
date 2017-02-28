package com.cdc.mysqlmanger.exception;

/**
 * 连接异常
 */
public class ConnectionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3883250171844267171L;

	public ConnectionException(String s) {
		super(s);
	}
}
