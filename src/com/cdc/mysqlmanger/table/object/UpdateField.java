package com.cdc.mysqlmanger.table.object;

/**
 * 在操作中被修改的字段对象
 */
public class UpdateField {

	private Field sourceField;
	
	private Field newField;

	public UpdateField(Field sourceField, Field newField) {
		this.sourceField = sourceField;
		this.newField = newField;
	}

	public Field getSourceField() {
		return sourceField;
	}

	public void setSourceField(Field sourceField) {
		this.sourceField = sourceField;
	}

	public Field getNewField() {
		return newField;
	}

	public void setNewField(Field newField) {
		this.newField = newField;
	}
	
	
}
