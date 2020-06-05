package com.example.leifeng.dao;

import com.example.leifeng.models.Userinfo;

import java.util.List;
import java.util.Map;

public interface UserinfoMapper {
    List<Map<String,Object>> operatingLevel(String shUserID);
    List<Userinfo> selectAll(int page,int limit, String shUserID);
    List<Userinfo>  search(int page, int limit, String shUserId, String shRealName, String shPhone, String RshUserId);
    int countSearch( String shUserId, String shRealName, String shPhone, String RshUserId);
    int updateMerchant(String shUserID,String shRealName,String shPhone);
    int countAll(String shUserID);
    int deleteByPrimaryKey(Integer id);
    int updateDividend(String shUserId,String shUserIdA,int shPaymentRatioA,String shUserIdB,int shPaymentRatioB);
    int examineUser(String shUserId);
    int insert(Userinfo record);
    Map<String,Object> getShSuperiorDealerALL(String shUserIdUp);
    int insertSelective(Userinfo record);
    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}