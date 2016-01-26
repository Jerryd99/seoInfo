package com.winndoo.seoinfo.mapper;

import com.winndoo.seoinfo.po.Projdes;
import com.winndoo.seoinfo.po.ProjdesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjdesMapper {
    int countByExample(ProjdesExample example);

    int deleteByExample(ProjdesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projdes record);

    int insertSelective(Projdes record);

    List<Projdes> selectByExample(ProjdesExample example);

    Projdes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projdes record, @Param("example") ProjdesExample example);

    int updateByExample(@Param("record") Projdes record, @Param("example") ProjdesExample example);

    int updateByPrimaryKeySelective(Projdes record);

    int updateByPrimaryKey(Projdes record);
}