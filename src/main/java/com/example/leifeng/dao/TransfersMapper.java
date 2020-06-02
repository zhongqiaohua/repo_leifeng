package com.example.leifeng.dao;

import com.example.leifeng.models.Requestwithdraw;
import com.example.leifeng.models.Transfers;

import java.util.List;

public interface TransfersMapper {
    List<Requestwithdraw> selALL(int page, int limit, String shUserID);
    int countRequestWithdraw(String shUserID);
    List<Requestwithdraw> search(int page,int limit,String shUserID);
    int countSearch(String shUserID);
    int insert(Transfers record);

    int insertSelective(Transfers record);
}