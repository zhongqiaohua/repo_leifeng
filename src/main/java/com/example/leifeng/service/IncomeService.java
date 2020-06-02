package com.example.leifeng.service;

import com.alibaba.fastjson.JSONObject;
import com.example.leifeng.dao.IncomeMapper;
import com.example.leifeng.tools.LayuiFormatTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @program: leifeng
 * @description:
 * @author: lingbin
 * @create: 2020-05-29 17:05
 **/
@Service
public class IncomeService {
    @Autowired
    IncomeMapper incomeMapper;
    @Autowired
    LayuiFormatTool layuiFormatTool;
    public Map<String,Object> selAllByShUserId(int page,int limit,String shUserID){
        int total = incomeMapper.countSearch(shUserID);
        Object json = JSONObject.toJSON(incomeMapper.selAllByShUserId(page-1,limit,shUserID)) ;
        return layuiFormatTool.transformMap(total,json);
    }
    public Map<String,Object> search(int page,int limit,String shUserID){
        int total = incomeMapper.countSearch(shUserID);
        Object json = JSONObject.toJSON(incomeMapper.search(page-1,limit,shUserID)) ;
        return layuiFormatTool.transformMap(total,json);
    }

}
