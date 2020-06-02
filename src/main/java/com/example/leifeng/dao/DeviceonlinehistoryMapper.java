package com.example.leifeng.dao;

import com.example.leifeng.models.Deviceonlinehistory;

public interface DeviceonlinehistoryMapper {
    int insert(Deviceonlinehistory record);

    int insertSelective(Deviceonlinehistory record);
}