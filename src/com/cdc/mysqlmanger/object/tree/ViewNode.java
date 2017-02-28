package com.cdc.mysqlmanger.object.tree;

import javax.swing.Icon;

import com.cdc.mysqlmanger.object.ViewObject;
import com.cdc.mysqlmanger.util.ImageUtil;

/**
 * 视图节点
 *
 */
public class ViewNode implements ViewObject {

	private Database database;
	
	public ViewNode(Database database) {
		this.database = database;
	}

	
	public Icon getIcon() {
		return ImageUtil.VIEW_TREE_ICON;
	}

	
	public String toString() {
		return "视图";
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
}
