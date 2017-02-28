package com.cdc.mysqlmanger.database;

import java.io.File;
import java.util.List;

import com.cdc.mysqlmanger.object.GlobalContext;
import com.cdc.mysqlmanger.object.list.TableData;
import com.cdc.mysqlmanger.object.tree.Database;
import com.cdc.mysqlmanger.object.tree.ServerConnection;

/**
 * 备份处理接口，用于导出脚本和执行脚本
 */
public interface BackupHandler {

	/**
	 * 导出一个数据库到文件targetFile中
	 * @param ctx
	 * @param db
	 * @param targetFile
	 */
	void dumpDatabase(GlobalContext ctx, Database db, File targetFile);
	
	/**
	 * 导出多个表
	 * @param ctx
	 * @param table
	 * @param db
	 * @param targetFile
	 */
	void dumpTable(GlobalContext ctx, List<TableData> table, Database db, 
			File targetFile);
	
	/**
	 * 为某个数据库导入一份SQL文件
	 * @param ctx
	 * @param db
	 * @param sqlFile
	 */
	void executeSQLFile(GlobalContext ctx, Database db, File sqlFile);
	
	/**
	 * 为某个服务器连接导入一份SQL文件
	 * @param ctx
	 * @param conn
	 * @param sqlFile
	 */
	void executeSQLFile(GlobalContext ctx, ServerConnection conn, File sqlFile);
}
