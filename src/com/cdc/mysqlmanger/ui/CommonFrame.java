package com.cdc.mysqlmanger.ui;

import javax.swing.JFrame;

/**
 * 有确定按钮的各个JFrame的父类
 */
public abstract class CommonFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7701889523721390133L;

	protected abstract void confirm(String name);
}
