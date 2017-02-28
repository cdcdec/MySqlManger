package com.cdc.mysqlmanger.object.tree;

import java.sql.Connection;

import com.cdc.mysqlmanger.object.ViewObject;

/**
 * 需要进行连接的节点的父类， Database与ServerConnection
 * 
 *
 */
public abstract class ConnectionNode implements ViewObject {

	protected Connection connection;
	
	public abstract Connection connect();
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
