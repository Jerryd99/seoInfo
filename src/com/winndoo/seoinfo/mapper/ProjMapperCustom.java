package com.winndoo.seoinfo.mapper;

import java.util.List;

import com.winndoo.seoinfo.po.ProjDetailInfo;
import com.winndoo.seoinfo.po.ProjSimpleInfo;



public interface ProjMapperCustom {
	public List<ProjSimpleInfo> findProjsList() throws Exception;
	public ProjDetailInfo findProjDesListByProjId(int id) throws Exception;
	
	public String findProjPriceDesByProjId(int id) throws Exception;
	public String findProjPriceFileByProjId(int id) throws Exception;
	public String findProjDetailDesByProjId(int id) throws Exception;
	public String findProjDetailFileByProjId(int id) throws Exception;
}
