package com.example.leifeng.dao;

import com.example.leifeng.models.Concurrency;

public interface ConcurrencyMapper {
    int insert(Concurrency record);

    int insertSelective(Concurrency record);
}