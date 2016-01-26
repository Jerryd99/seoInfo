package com.winndoo.seoinfo.po;

import java.util.Date;
import java.util.List;

public class TableInfo {
	private Integer tableId;
	
	private String tableName;

    private List<ProjSimpleInfo> projs;

    public TableInfo(Integer tableId, String tableName, List<ProjSimpleInfo> list){
    	this.tableId = tableId;
    	this.tableName = tableName;
    	this.projs = list;
    }
    
	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<ProjSimpleInfo> getProjs() {
		return projs;
	}

	public void setProjs(List<ProjSimpleInfo> projs) {
		this.projs = projs;
	}
    
    
}
