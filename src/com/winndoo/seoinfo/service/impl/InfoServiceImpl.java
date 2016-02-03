package com.winndoo.seoinfo.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.winndoo.seoinfo.exception.CustomException;
import com.winndoo.seoinfo.mapper.FilesMapper;
import com.winndoo.seoinfo.mapper.ProjMapperCustom;
import com.winndoo.seoinfo.mapper.ProjinfoMapper;
import com.winndoo.seoinfo.mapper.ProjtypeMapper;
import com.winndoo.seoinfo.mapper.UserMapper;
import com.winndoo.seoinfo.mapper.UserMapperCustom;
import com.winndoo.seoinfo.po.ProjDetailInfo;
import com.winndoo.seoinfo.po.ProjSimpleInfo;
import com.winndoo.seoinfo.po.Projinfo;
import com.winndoo.seoinfo.po.TableInfo;
import com.winndoo.seoinfo.po.User;
import com.winndoo.seoinfo.service.InfoService;

public class InfoServiceImpl implements InfoService{
	
	@Autowired
	private ProjMapperCustom projMapperCustom;
	
	@Autowired
	private ProjtypeMapper projtypeMapper;
	
	@Autowired
	private ProjinfoMapper projinfoMapper;
	
	@Autowired
	private FilesMapper filesMapper;
	
	@Autowired
	private UserMapperCustom userMapperCustom;

	@Override
	public List<ProjSimpleInfo> findProjsList() throws Exception {
		// TODO Auto-generated method stub
		return projMapperCustom.findProjsList();
	}
	
	@Override
	public String findProjNameById(int id) throws Exception {
		// TODO Auto-generated method stub
		return projtypeMapper.selectByPrimaryKey(id).getProjname();
	}
	
	@Override
	public ProjDetailInfo findProjDesListByProjId(int id) throws Exception {
		// TODO Auto-generated method stub
		return projMapperCustom.findProjDesListByProjId(id);
	}

	@Override
	public String findProjPriceDesByProjId(int id) throws Exception {
		// TODO 判断为空
		return projMapperCustom.findProjPriceDesByProjId(id);
	}

	@Override
	public String findProjPriceFileByProjId(int id) throws Exception {
		// TODO Auto-generated method stub
		return projMapperCustom.findProjPriceFileByProjId(id);
	}

	@Override
	public String findProjDetailDesByProjId(int id) throws Exception {
		// TODO Auto-generated method stub
		return projMapperCustom.findProjDetailDesByProjId(id);
	}

	@Override
	public String findProjDetailFileByProjId(int id) throws Exception {
		// TODO Auto-generated method stub
		return projMapperCustom.findProjDetailFileByProjId(id);
	}

	@Override
	public List<TableInfo> getTablesInfo(List<ProjSimpleInfo> list) throws Exception {
		Map<Integer,TableInfo> tablesMap = new HashMap<Integer,TableInfo>();
		for(ProjSimpleInfo proj : list){
			if(tablesMap.containsKey(proj.getTableId())){
				tablesMap.get(proj.getTableId()).getProjs().add(proj);
			}
			else{
				List<ProjSimpleInfo> projList = new ArrayList<ProjSimpleInfo>();
				projList.add(proj);
				TableInfo tableInfo = new TableInfo(proj.getTableId(), proj.getTableName(),projList);
				tablesMap.put(proj.getTableId(), tableInfo);
			}
		}
        List<TableInfo> mapValueList = new ArrayList<TableInfo>();
        Iterator it = tablesMap.keySet().iterator();
//        List<TableInfo> tablesList = new ArrayList<TableInfo>();
        while (it.hasNext()) {
            mapValueList.add(tablesMap.get(it.next()));
        }
        
        
		return mapValueList;
	}

	@Override
	public void download(HttpServletRequest request,
			HttpServletResponse response, String fullFileName, String contentType) throws Exception {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		String ctxPath = request.getSession().getServletContext().getRealPath("/") + "upLoadDir/";
		String downLoadPath = ctxPath + fullFileName;

		File file = new File(downLoadPath);
		long fileLength = file.length();

		response.setContentType(contentType);
		response.setHeader("Content-disposition", "attachment; filename=" + fullFileName);
		response.setHeader("Content-Length", String.valueOf(fileLength));
		bis = new BufferedInputStream(new FileInputStream(downLoadPath));
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		bis.close();
		bos.close();
	}

	@Override
	public User findUserByNickName(String nickname) throws Exception {
		// TODO Auto-generated method stub
		return userMapperCustom.findUserByNickname(nickname);
	}
	
}
