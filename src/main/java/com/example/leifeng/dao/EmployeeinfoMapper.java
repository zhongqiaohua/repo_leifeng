package com.example.leifeng.dao;

import com.example.leifeng.models.Employeeinfo;

import java.util.List;


public interface EmployeeinfoMapper {
    int insert(Employeeinfo record);
    int updateByUserID(Employeeinfo record);
    int insertSelective(Employeeinfo record);
    List<Employeeinfo> selectAll(int page,int limit,String employeeUserId,String employeeCompany,String shUserID);
    List<Employeeinfo> multiConditionSelect(String employeeUserId,String employeeCompany);
    Employeeinfo selectById(int id);
    int count(String shUserID);
    void delById(int Id);
}