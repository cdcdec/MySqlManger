package com.cdc.mysqlmanger.ui.list;

import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import com.cdc.mysqlmanger.object.ViewObject;

/**
 * 列表渲染类
 */
public class ListCellRenderer extends DefaultListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1231610294222313185L;

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		JLabel label = (JLabel)super.getListCellRendererComponent(list, 
				value, index, isSelected, cellHasFocus);
		ViewObject vd = (ViewObject)value;
		label.setIcon(vd.getIcon());
		label.setToolTipText(vd.toString());
		if (isSelected) {
			setBackground(Color.blue);
			setForeground(Color.white);
		}
		return this;
	}
}
