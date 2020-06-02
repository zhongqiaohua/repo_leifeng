package com.example.leifeng.service;

import com.example.leifeng.dao.UserinfoMapper;
import com.example.leifeng.models.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: leifeng
 * @description: 商户
 * @author: lingbin
 * @create: 2020-03-24 09:46
 **/
@Service
public class UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;
    public Map<String,Object> selectAll(int page,int limit, String shUserID){
        Map<String,Object> userMap = new HashMap<>();
        int total = userinfoMapper.countAll(shUserID);
        userMap.put("code","0");
        userMap.put("msg","");
        userMap.put("count",total);
        Object json = JSONObject.toJSON(userinfoMapper.selectAll(page-1,limit,shUserID)) ;
        userMap.put("data",json);
        return userMap;
    }
    public Map<String,Object> search(int page, int limit,String shUserId,String shRealName,String shPhone,String RshUserId){
        if(shUserId == "")
            shUserId = null;
        if(shRealName == "")
            shRealName = null;
        if(shPhone == "")
            shPhone = null;
        Map<String,Object> userMap = new HashMap<>();
        int total = userinfoMapper.countSearch(shUserId,shRealName,shPhone,RshUserId);
        userMap.put("code","0");
        userMap.put("msg","");
        userMap.put("count",total);
        Object json = JSONObject.toJSON(userinfoMapper.search(page-1,limit,shUserId,shRealName,shPhone,RshUserId)) ;
        userMap.put("data",json);
        return userMap;
    }
    public int updateMerchant(String shUserID,String shRealName,String shPhone){
//        System.out.println(shUserID+ " " +shRealName + " " +shPhone);
//        return 1;
        return userinfoMapper.updateMerchant(shUserID,shRealName,shPhone);
    }
    public int updateDividend(String shUserId,String shUserIdA,int shPaymentRatioA,String shUserIdB,int shPaymentRatioB){
        return userinfoMapper.updateDividend(shUserId,shUserIdA,shPaymentRatioA,shUserIdB,shPaymentRatioB);
    }
    public int examineUser(String shUserId){
        return userinfoMapper.examineUser(shUserId);
    }
    public int addUser(String shUserIdUp,String shUserId,String shRealName,String shPhone,int shPaymentRatio){
        Userinfo userinfo = new Userinfo();
        Map<String,Object> getSh = userinfoMapper.getShSuperiorDealerALL(shUserIdUp);
        switch ((Integer) getSh.get("sh_level")){//找上级商户
            case 3:
                userinfo.setShSuperiorDealer3(String.valueOf(getSh.get("sh_superior_dealer_3")));
            case 2:
                userinfo.setShSuperiorDealer2(String.valueOf(getSh.get("sh_superior_dealer_2")));
            case 1:
                userinfo.setShSuperiorDealer1(String.valueOf(getSh.get("sh_superior_dealer_1")));
            case 0:
                userinfo.setShSuperiorDealer0(String.valueOf(getSh.get("sh_superior_dealer_0")));
                break;
        }
        switch ((Integer) getSh.get("sh_level")){//找当前商户
            case 3:
                userinfo.setShSuperiorDealer3(shUserIdUp);
                break;
            case 2:
                userinfo.setShSuperiorDealer2(shUserIdUp);
                break;
            case 1:
                userinfo.setShSuperiorDealer1(shUserIdUp);
                break;
            case 0:
                userinfo.setShSuperiorDealer0(shUserIdUp);
                break;
        }
        userinfo.setShUserId(shUserId);
        userinfo.setPassword("987321");
        userinfo.setShRealName(shUserId);
        userinfo.setRate(1);
        userinfo.setShCompanyName(shRealName);
        userinfo.setShPhone(shPhone);
        userinfo.setShLevel((Integer) getSh.get("sh_level")+1);
        userinfo.setShPaymentRatio(shPaymentRatio);
        System.out.println(userinfo.toString());
        return userinfoMapper.insert(userinfo);
    }
}
