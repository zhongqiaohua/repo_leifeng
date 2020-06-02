package com.example.leifeng.dao;

import com.example.leifeng.models.Payordertmp;

public interface PayordertmpMapper {
    int insert(Payordertmp record);

    int insertSelective(Payordertmp record);
}