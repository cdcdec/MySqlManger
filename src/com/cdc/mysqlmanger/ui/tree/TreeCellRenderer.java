package com.cdc.mysqlmanger.ui.tree;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import com.cdc.mysqlmanger.object.ViewObject;

/**
 * 树各个节点的处理类
 */
@SuppressWarnings("serial")
public class TreeCellRenderer extends DefaultTreeCellRenderer {
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)value;
		//获得每个节点的ViewObject
		ViewObject obj = (ViewObject)node.getUserObject();
		if (obj == null) return this;
		//设置图片与文件
		this.setText(obj.toString());
		this.setIcon(obj.getIcon());
		//判断是否选来设置字体颜色
		if (sel) this.setForeground(Color.blue);
		else this.setForeground(getTextNonSelectionColor());
		return this;
	}
}
