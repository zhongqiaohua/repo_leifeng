package com.example.leifeng.dao;

import com.example.leifeng.models.Priceinfo;
import com.example.leifeng.models.PriceinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PriceinfoMapper {
    int countByExample(PriceinfoExample example);

    int deleteByExample(PriceinfoExample example);

    int insert(Priceinfo record);

    int insertSelective(Priceinfo record);

    List<Priceinfo> selectByExample(PriceinfoExample example);

    int updateByExampleSelective(@Param("record") Priceinfo record, @Param("example") PriceinfoExample example);

    int updateByExample(@Param("record") Priceinfo record, @Param("example") PriceinfoExample example);

    List<Priceinfo> selectAll(int page, int limit);
}