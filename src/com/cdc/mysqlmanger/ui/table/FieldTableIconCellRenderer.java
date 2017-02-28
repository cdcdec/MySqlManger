package com.cdc.mysqlmanger.ui.table;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * 字符列表的渲染对象
 */
public class FieldTableIconCellRenderer extends DefaultTableCellRenderer {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7124710108085706454L;

	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		//判断单元格的值类型，分别调用setIcon与setText方法
		if (value instanceof Icon) this.setIcon((Icon)value);
		else this.setText((String)value);
		this.setHorizontalAlignment(CENTER);
		return this;
	}
}
