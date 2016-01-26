package com.winndoo.seoinfo.mapper;

import com.winndoo.seoinfo.po.Projtype;
import com.winndoo.seoinfo.po.ProjtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjtypeMapper {
    int countByExample(ProjtypeExample example);

    int deleteByExample(ProjtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projtype record);

    int insertSelective(Projtype record);

    List<Projtype> selectByExample(ProjtypeExample example);

    Projtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projtype record, @Param("example") ProjtypeExample example);

    int updateByExample(@Param("record") Projtype record, @Param("example") ProjtypeExample example);

    int updateByPrimaryKeySelective(Projtype record);

    int updateByPrimaryKey(Projtype record);
}