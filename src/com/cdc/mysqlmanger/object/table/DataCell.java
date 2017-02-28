package com.cdc.mysqlmanger.object.table;

/**
 * 数据表格中的单元格对象
 */
public class DataCell {

	//该单元格所在的行
	private int row;
	
	//该单元格所在的列
	private DataColumn column;
	
	//该单元格的值
	private String value;
		
	public DataCell(int row, DataColumn column, String value) {
		this.row = row;
		this.column = column;
		this.value = value;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public DataColumn getColumn() {
		return column;
	}
	
	public void setColumn(DataColumn column) {
		this.column = column;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return this.value;
	}
	
	
}
