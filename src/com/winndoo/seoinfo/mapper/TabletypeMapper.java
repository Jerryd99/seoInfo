package com.winndoo.seoinfo.mapper;

import com.winndoo.seoinfo.po.Tabletype;
import com.winndoo.seoinfo.po.TabletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TabletypeMapper {
    int countByExample(TabletypeExample example);

    int deleteByExample(TabletypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tabletype record);

    int insertSelective(Tabletype record);

    List<Tabletype> selectByExample(TabletypeExample example);

    Tabletype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tabletype record, @Param("example") TabletypeExample example);

    int updateByExample(@Param("record") Tabletype record, @Param("example") TabletypeExample example);

    int updateByPrimaryKeySelective(Tabletype record);

    int updateByPrimaryKey(Tabletype record);
}