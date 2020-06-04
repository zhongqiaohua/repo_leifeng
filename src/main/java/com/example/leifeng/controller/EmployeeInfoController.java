package com.example.leifeng.controller;

import com.example.leifeng.models.Employeeinfo;
import com.example.leifeng.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: leifeng
 * @description: 员工
 * @author: lingbin
 * @create: 2020-03-06 17:20
 **/
@Controller
@ResponseBody
@RequestMapping("/Employee")
public class EmployeeInfoController {
    //查询所有
    @Autowired
    EmployeeInfoService employeeInfoService;

    @RequestMapping("/insert")
    /**
     * employeeUserId,员工名称
     * password,密码
     * employeePhone,电话,
     * employeeCompany,所属商户
     * employeeLevel,运营权限
     * freeCharge,免费扫码
     */
    public int insert(String employeeUserId,String employeePhone,String employeeCompany,String employeeLevel,String freeCharge){
        return employeeInfoService.insert(employeeUserId,employeePhone,employeeCompany,employeeLevel,freeCharge);
    }
    @RequestMapping("/update")
    /**
     * employeeUserId,员工名称
     * password,密码
     * employeePhone,电话,
     * employeeCompany,所属商户
     * employeeLevel,运营权限
     * freeCharge,免费扫码
     */
    public int updateByUserID(String employeeUserId,String password,String employeePhone,String employeeCompany,String employeeLevel,String freeCharge){
        return employeeInfoService.updateByUserID(employeeUserId,password,employeePhone,employeeCompany,employeeLevel,freeCharge);
    }
//        return employeeInfoService.insert(employeeUserId,password,employeePhone,employeeCompany,employeeLevel,freeCharge);
//    }
    @RequestMapping("/selectAll")
    /**
     *  page 为当前页
     *  limit  为当前页显示的条数
     *  employeeUserId 员工名
     *  employeeCompany 商户名
     *  shUserID 当前登录商户
     */
    public Map<String,Object> selectAll(@RequestParam(required = false,defaultValue = "1") int page, @RequestParam(required = false,defaultValue = "5") int limit,
                                        String employeeUserId,String employeeCompany,String shUserID){
        return employeeInfoService.selectAll(page,limit,employeeUserId,employeeCompany,shUserID);
    }
    @RequestMapping("/multiConditionSelect")
    /**
     *
     *  employeeUserId、employeeCompany两个条件模糊查询
     *  shUserID 当前登录商户
     */
    public Map<String,Object> multiConditionSelect(String employeeUserId,String employeeCompany){
        return employeeInfoService.multiConditionSelect(employeeUserId,employeeCompany);
    }
    @RequestMapping("/delById")
    /**
     * 根据id删除
     */
    public void delById(int id){
         employeeInfoService.delById(id);
    }

}
