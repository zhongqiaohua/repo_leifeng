package com.example.leifeng.dao;

import com.example.leifeng.models.Payorder;

public interface PayorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Payorder record);

    int insertSelective(Payorder record);

//    Payorder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payorder record);

    int updateByPrimaryKey(Payorder record);
}