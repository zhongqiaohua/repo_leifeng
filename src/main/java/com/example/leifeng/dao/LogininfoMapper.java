package com.example.leifeng.dao;

import com.example.leifeng.models.Logininfo;

public interface LogininfoMapper {
    int insert(Logininfo record);

    int insertSelective(Logininfo record);
}