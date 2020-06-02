package com.example.leifeng.dao;

import com.example.leifeng.models.Deviceinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceinfoMapper {
    int insert(Deviceinfo record);
    List<Deviceinfo> selectAll(int page, int limit,String shUserID);
    List<Deviceinfo> search(int page,int limit,String deviceId,String controlId,String deviceAreaAddress,String userId,String RshUserId);
    List<Deviceinfo> multiconditionalSearch(int page,int limit,String shUserId,String network,String online,String chargetype,String RshUserId);
    List<String> linkageShUserId(String shUserID);
    List<String>  linkageNetwork(String shUserID);
    int count(String shUserID);
    int searchCount(String deviceId,String controlId,String deviceAreaAddress,String userId,String RshUserId);
    int multiconditionalSearchCount(String shUserId,String controlId,String deviceAreaAddress,String userId,String RshUserId);
    int insertSelective(Deviceinfo record);
    int unbindByDeviceid(String deviceId,String shUserId,String network);
    int deviceinfoMultiEdit(@Param(value = "deviceIds")Integer[] deviceId, @Param(value = "shUserId")String shUserId, @Param(value = "network")String network);
}