package com.winndoo.seoinfo.mapper;

import com.winndoo.seoinfo.po.Projinfo;
import com.winndoo.seoinfo.po.ProjinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjinfoMapper {
    int countByExample(ProjinfoExample example);

    int deleteByExample(ProjinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projinfo record);

    int insertSelective(Projinfo record);

    List<Projinfo> selectByExample(ProjinfoExample example);

    Projinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projinfo record, @Param("example") ProjinfoExample example);

    int updateByExample(@Param("record") Projinfo record, @Param("example") ProjinfoExample example);

    int updateByPrimaryKeySelective(Projinfo record);

    int updateByPrimaryKey(Projinfo record);
}