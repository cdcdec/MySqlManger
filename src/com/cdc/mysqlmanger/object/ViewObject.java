package com.cdc.mysqlmanger.object;

import javax.swing.Icon;

/**
 * 外观显示的接口, 让树节点接口和JList数据的接口继承
 */
public interface ViewObject {
	
	/**
	 * 返回显示的图片
	 * @return
	 */
	Icon getIcon();
}
