package com.cdc.mysqlmanger.system.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cdc.mysqlmanger.exception.FileException;
import com.cdc.mysqlmanger.object.tree.ServerConnection;
import com.cdc.mysqlmanger.system.PropertiesHandler;
import com.cdc.mysqlmanger.util.FileUtil;

/**
 * 属性文件处理实现类
 */
public class PropertiesHandlerImpl implements PropertiesHandler {

	
	public void saveServerConnection(ServerConnection conn) {
		//得到配置文件名, 这些properties文件存放于connections目录下
		String configFileName = FileUtil.CONNECTIONS_FOLDER + 
			conn.getConnectionName() + ".properties";
		//创建properties文件
		File connConfigFile = new File(configFileName);
		//创建文件
		FileUtil.createNewFile(connConfigFile);
		Properties props = new Properties();
		props.setProperty(FileUtil.HOST, conn.getHost());
		props.setProperty(FileUtil.PORT, conn.getPort());
		props.setProperty(FileUtil.USERNAME, conn.getUsername());
		props.setProperty(FileUtil.PASSWORD, conn.getPassword());
		//将属性写入配置文件
		FileUtil.saveProperties(connConfigFile, props, "Connection " + 
				conn.getConnectionName() + " config.");
	}

	
	public List<ServerConnection> getServerConnections() {
		File[] propertyFiles = getPropertyFiles();
		List<ServerConnection> result = new ArrayList<ServerConnection>();
		for (File file : propertyFiles) {
			ServerConnection conn = createServerConnection(file);
			result.add(conn);
		}
		return result;
	}
		
	/**
	 * 将一份properties文件封装成ServerConnection对象
	 * @param file
	 * @return
	 */
	private ServerConnection createServerConnection(File file) {
		try {
			
			Properties prop = FileUtil.getProperties(file);
			ServerConnection conn = new ServerConnection(FileUtil.getFileName(file), 
					prop.getProperty(FileUtil.USERNAME), 
					prop.getProperty(FileUtil.PASSWORD), 
					prop.getProperty(FileUtil.HOST), 
					prop.getProperty(FileUtil.PORT));
			return conn;
		} catch (Exception e) {
			throw new FileException("读取配置文件错误：" + file.getAbsolutePath());
		}
	}
	
	
	//返回connections目录下所有的文件
	private File[] getPropertyFiles() {
		File connectioFolder = new File(FileUtil.CONNECTIONS_FOLDER);
		return connectioFolder.listFiles();
	}

}
