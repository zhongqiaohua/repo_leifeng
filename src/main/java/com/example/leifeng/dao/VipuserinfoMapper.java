package com.example.leifeng.dao;

import com.example.leifeng.models.Vipuserinfo;
import com.example.leifeng.models.VipuserinfoExample;

import java.util.List;

public interface VipuserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vipuserinfo record);

    int insertSelective(Vipuserinfo record);

    Vipuserinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Vipuserinfo record);

    int updateByPrimaryKey(Vipuserinfo record);

    List<Vipuserinfo> selectByExample(VipuserinfoExample example);
}