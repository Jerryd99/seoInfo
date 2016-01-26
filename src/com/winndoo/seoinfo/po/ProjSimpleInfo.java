package com.winndoo.seoinfo.po;

import java.util.Date;

public class ProjSimpleInfo  {
	private Integer tableId;
	
	private String tableName;

    private Integer projId;

    private String projName;

    private String rateResult;
    
    private Date updateTime;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProj_id(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getRateResult() {
		return rateResult;
	}

	public void setRateResult(String rateResult) {
		this.rateResult = rateResult;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}
	
}
