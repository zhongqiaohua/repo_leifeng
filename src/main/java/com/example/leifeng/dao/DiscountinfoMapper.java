package com.example.leifeng.dao;

import com.example.leifeng.models.Discountinfo;

public interface DiscountinfoMapper {
    int insert(Discountinfo record);

    int insertSelective(Discountinfo record);
}