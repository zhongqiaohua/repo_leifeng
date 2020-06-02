package com.example.leifeng.service;

import com.alibaba.fastjson.JSONObject;
import com.example.leifeng.dao.DeviceinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: leifeng
 * @description: 设备
 * @author: lingbin
 * @create: 2020-05-12 14:44
 **/
@Service
public class DeviceinfoService {
    @Autowired
    private DeviceinfoMapper deviceinfoMapper;
    public Map<String,Object> selectAll(int page,int limit,String shUserID){
        Map<String,Object> deviceMap = new LinkedHashMap<>();
        int total = deviceinfoMapper.count(shUserID);
        deviceMap.put("code","0");
        deviceMap.put("msg","");
        deviceMap.put("count",total);
        Object json = JSONObject.toJSON(deviceinfoMapper.selectAll(page-1,limit,shUserID)) ;
        deviceMap.put("data",json);
        return deviceMap;
    }
    public Map<String,Object> search(int page,int limit,String deviceId,String controlId,String deviceDetailAddress,String userId,String RshUserId){
        if(deviceId == "")
            deviceId = null;
        if(controlId == "")
            controlId = null;
        if(deviceDetailAddress == "")
            deviceDetailAddress = null;
        if(userId == "")
            userId = null;
        Map<String,Object> deviceMap = new LinkedHashMap<>();
        int total = deviceinfoMapper.searchCount(deviceId,controlId,deviceDetailAddress,userId,RshUserId);
        deviceMap.put("code","0");
        deviceMap.put("msg","");
        deviceMap.put("count",total);
        Object json = JSONObject.toJSON(deviceinfoMapper.search(page-1,limit,deviceId,controlId,deviceDetailAddress,userId,RshUserId)) ;
        deviceMap.put("data",json);
        return deviceMap;
    }
    public Map<String,Object> multiconditionalSearch(int page,int limit,String shUserId,String network,String online,String chargetype,String RshUserId){
        if(shUserId == "")
            shUserId = null;
        if(network == "")
            network = null;
        if(online == "")
            online = null;
        if(chargetype == "")
            chargetype = null;
        Map<String,Object> deviceMap = new LinkedHashMap<>();
        int total = deviceinfoMapper.multiconditionalSearchCount(shUserId,network,online,chargetype,RshUserId);
        deviceMap.put("code","0");
        deviceMap.put("msg","");
        deviceMap.put("count",total);
        Object json = JSONObject.toJSON(deviceinfoMapper.multiconditionalSearch(page-1,limit,shUserId,network,online,chargetype,RshUserId));
        deviceMap.put("data",json);
        return deviceMap;
    }
    public List<String> linkageShUserId(String shUserId){
        return deviceinfoMapper.linkageShUserId(shUserId);
    }
    public List<String> linkageNetwork(String shUserId){
        if(shUserId == "")
            shUserId = null;
        return deviceinfoMapper.linkageNetwork(shUserId);
    }
    public int unbindByDeviceid(String deviceid){
         String shUserId="雷风",network="解绑";
        return deviceinfoMapper.unbindByDeviceid(deviceid,shUserId,network);
    }
    public int unbindByDeviceid(String deviceId,String shUserId,String network){
        return deviceinfoMapper.unbindByDeviceid(deviceId,shUserId,network);
    }
    public int deviceinfoMultiEdit(Integer[] deviceId,String shUserId,String network){
//        System.out.println("----------------------------"+deviceId[0]+"----------------------------"+shUserId+"----------------------------"+network);
        return deviceinfoMapper.deviceinfoMultiEdit(deviceId,shUserId,network);
    }
}
