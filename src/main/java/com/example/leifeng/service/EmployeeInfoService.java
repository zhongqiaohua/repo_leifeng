package com.example.leifeng.service;

import com.alibaba.fastjson.JSONObject;
import com.example.leifeng.dao.EmployeeinfoMapper;
import com.example.leifeng.models.Employeeinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: leifeng
 * @description: 员工服务
 * @author: lingbin
 * @create: 2020-03-06 17:23
 **/
@Service
public class EmployeeInfoService   {
    @Autowired
    private EmployeeinfoMapper employee;
    public int insert(String employeeUserId,String employeePhone,String employeeCompany,String employeeLevel,String freeCharge) {
        String password = "987321";
        if (freeCharge.equals("on"))
            freeCharge = "1";
        else
            freeCharge = "0";
        Employeeinfo record = new Employeeinfo(employeeUserId,password,employeePhone,employeeCompany,Integer.valueOf(employeeLevel),Integer.valueOf(freeCharge));
        return employee.insert(record);
    }
    public int updateByUserID(String employeeUserId,String password,String employeePhone,String employeeCompany,String employeeLevel,String freeCharge) {
        if (freeCharge.equals("on"))
            freeCharge = "1";
        else
            freeCharge = "0";
        Employeeinfo record = new Employeeinfo(employeeUserId,password,employeePhone,employeeCompany,Integer.valueOf(employeeLevel),Integer.valueOf(freeCharge));
        return employee.updateByUserID(record);
    }

    public int insertSelective(Employeeinfo record) {
        return employee.insertSelective(record);
    }

    public Map<String,Object> selectAll(int page,int limit,String employeeUserId,String employeeCompany) {
        if(employeeUserId == "")
            employeeUserId = null;
        if(employeeCompany == "")
            employeeCompany = null;
        Map<String,Object> employeeMap = new LinkedHashMap<>();
        int total = employee.count();
        employeeMap.put("code","0");
        employeeMap.put("msg","");
        employeeMap.put("count",total);
        Object json = JSONObject.toJSON(employee.selectAll(page-1,limit,employeeUserId,employeeCompany)) ;
        employeeMap.put("data",json);
        return employeeMap;
    }
    public Map<String,Object> multiConditionSelect(int page,int limit,String employeeUserId,String employeeCompany) {
        Map<String,Object> employeeMap = new LinkedHashMap<>();
        employeeMap.put("code","0");
        employeeMap.put("msg","");
        Object json = JSONObject.toJSON(employee.multiConditionSelect(page-1,limit,employeeUserId,employeeCompany)) ;
        employeeMap.put("data",json);
        return employeeMap;
    }
    public Employeeinfo selectById(String id)
    {
        return employee.selectById(Integer.valueOf(id));
    }
    public void delById(int id){
         employee.delById(id);
    }
}
