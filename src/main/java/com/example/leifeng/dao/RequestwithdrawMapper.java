package com.example.leifeng.dao;

import com.example.leifeng.models.Requestwithdraw;

import java.util.List;

public interface RequestwithdrawMapper {
    int insert(Requestwithdraw record);
    int insertSelective(Requestwithdraw record);
}