package com.example.leifeng.service;

import com.alibaba.fastjson.JSONObject;
import com.example.leifeng.dao.TransfersMapper;
import com.example.leifeng.tools.LayuiFormatTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @program: leifeng
 * @description:
 * @author: lingbin
 * @create: 2020-05-30 11:51
 **/
@Service
public class TransfersService {
    @Autowired
    TransfersMapper transfersMapper;
    @Autowired
    LayuiFormatTool layuiFormatTool;
    public Map<String,Object> selALL(int page, int limit, String shUserID){
        int total = transfersMapper.countSearch(shUserID);
        Object json = JSONObject.toJSON(transfersMapper.selALL(page-1,limit,shUserID)) ;
        return layuiFormatTool.transformMap(total,json);
    }
    public Map<String,Object> search(int page,int limit,String shUserID){
        int total = transfersMapper.countSearch(shUserID);
        Object json = JSONObject.toJSON(transfersMapper.search(page-1,limit,shUserID)) ;
        return layuiFormatTool.transformMap(total,json);
    }
}
