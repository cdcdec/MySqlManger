package com.cdc.mysqlmanger.object;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.cdc.mysqlmanger.database.BackupHandler;
import com.cdc.mysqlmanger.database.impl.BackupHandlerImpl;
import com.cdc.mysqlmanger.object.tree.ServerConnection;
import com.cdc.mysqlmanger.system.PropertiesHandler;
import com.cdc.mysqlmanger.system.impl.PropertiesHandlerImpl;
import com.cdc.mysqlmanger.util.FileUtil;

/**
 * 全局上下文
 */
public class GlobalContext {

	//mysql安装目录绝对路径
	private String mySQLHome;
	
	//属性文件处理接口
	private PropertiesHandler propertiesHandler = new PropertiesHandlerImpl();
	//备份接口
	private BackupHandler backHandler = new BackupHandlerImpl();
	
	public GlobalContext(String mySQLHome) {
		this.mySQLHome = mySQLHome;
		//将mySQLHome加到环境变量中
		Properties props = System.getProperties();
		props.setProperty("mysql.home", mySQLHome);
		System.setProperties(props);
	}
	
	public BackupHandler getBackupHandler() {
		return this.backHandler;
	}
	
	//存放所有服务器连接的集合
	private Map<String, ServerConnection> connections = new HashMap<String, ServerConnection>();
	
	//添加一个连接到Map中
	public void addConnection(ServerConnection connection) {
		this.connections.put(connection.getConnectionName(), connection);
	}
	
	//从Map中删除一个连接
	public void removeConnection(ServerConnection connection) {
		//删除该连接的配置文件
		File configFile = new File(FileUtil.CONNECTIONS_FOLDER + 
				connection.getConnectionName() + ".properties");
		configFile.delete();
		this.connections.remove(connection.getConnectionName());
	}
	
	//从Map中获得一个DatabaseConnection对象
	public ServerConnection getConnection(String connectionName) {
		return this.connections.get(connectionName);
	}
	
	//返回mySQLHome
	public String getMySQLHome() {
		return this.mySQLHome;
	}
	
	public PropertiesHandler getPropertiesHandler() {
		return this.propertiesHandler;
	}
	
	public Map<String, ServerConnection> getConnections() {
		return this.connections;
	}
}
