package com.cdc.mysqlmanger.table.object;

/**
 * 在操作中被修改的外键对象
 */
public class UpdateForeignField {

	//界面中新的外键
	private ForeignField newForeignField;
	
	//数据库中旧的外键
	private ForeignField sourceForeignField;

	public UpdateForeignField(ForeignField sourceForeignField, 
			ForeignField newForeignField) {
		this.newForeignField = newForeignField;
		this.sourceForeignField = sourceForeignField;
	}

	public ForeignField getNewForeignField() {
		return newForeignField;
	}

	public void setNewForeignField(ForeignField newForeignField) {
		this.newForeignField = newForeignField;
	}

	public ForeignField getSourceForeignField() {
		return sourceForeignField;
	}

	public void setSourceForeignField(ForeignField sourceForeignField) {
		this.sourceForeignField = sourceForeignField;
	}
	
	
}
