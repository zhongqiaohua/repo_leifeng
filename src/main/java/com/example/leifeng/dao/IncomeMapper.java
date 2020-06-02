package com.example.leifeng.dao;

import com.example.leifeng.models.Income;

import java.util.List;

public interface IncomeMapper {
    List<Income> selAllByShUserId(int page,int limit,String shUserID);
    int countIncome(String shUserID);
    List<Income> search(int page,int limit,String shUserID);
    int countSearch(String shUserID);
}