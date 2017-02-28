package com.cdc.mysqlmanger.object.table;

/**
 * 数据列表中的列对象
 
 */
public class DataColumn {

	//该列在JTable中的索引
	private int index;
	
	//该列的文字
	private String text;

	public DataColumn(int index, String text) {
		this.index = index;
		this.text = text;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return this.text;
	}
	
	
}
