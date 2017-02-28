package com.cdc.mysqlmanger.exception;

/**
 * 命令执行异常
 */
public class CommandException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2916542512279085578L;

	public CommandException(String s) {
		super(s);
	}
}
