package com.cdc.mysqlmanger.system;

import java.util.List;

import com.cdc.mysqlmanger.object.tree.ServerConnection;

/**
 * properties文件处理接口
 */
public interface PropertiesHandler {

	/**
	 * 将一个ServerConnection对象保存至系统的properties中, 
	 * 该properties文件的文件名是ServerConnection的connectioName
	 * @param conn
	 */
	void saveServerConnection(ServerConnection conn);
	
	/**
	 * 去本地的connections目录中读取全部的配置文件, 并封装成ServerConnection集合
	 * @return
	 */
	List<ServerConnection> getServerConnections();
}
