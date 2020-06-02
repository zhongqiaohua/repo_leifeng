package com.example.leifeng.dao;

import com.example.leifeng.models.Priceinfo;

public interface PriceinfoMapper {
    int insert(Priceinfo record);

    int insertSelective(Priceinfo record);
}