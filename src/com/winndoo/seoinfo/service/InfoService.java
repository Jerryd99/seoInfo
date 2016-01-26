package com.winndoo.seoinfo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.winndoo.seoinfo.po.ProjDetailInfo;
import com.winndoo.seoinfo.po.ProjSimpleInfo;
import com.winndoo.seoinfo.po.TableInfo;

public interface InfoService {
	
	public List<ProjSimpleInfo> findProjsList() throws Exception;
	
	public String findProjNameById(int id) throws Exception;
	public ProjDetailInfo findProjDesListByProjId(int id) throws Exception;
	
	public String findProjPriceDesByProjId(int id) throws Exception;
	public String findProjPriceFileByProjId(int id) throws Exception;
	public String findProjDetailDesByProjId(int id) throws Exception;
	public String findProjDetailFileByProjId(int id) throws Exception;
	
	public List<TableInfo> getTablesInfo(List<ProjSimpleInfo> list) throws Exception;
	public void download(HttpServletRequest request,
			HttpServletResponse response, String fullFileName, String contentType) throws Exception;
	

}
