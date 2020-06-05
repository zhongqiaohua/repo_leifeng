package com.example.leifeng.controller;

import com.example.leifeng.models.Userinfo;
import com.example.leifeng.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @program: leifeng
 * @description: 商户
 * @author: lingbin
 * @create: 2020-03-24 09:51
 **/
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping("/selall")
    /**查询该商家的所有下属商家
     * shUserID
     */
    public Map<String,Object> selectAll(@RequestParam(required = false,defaultValue = "1") int page,
                                        @RequestParam(required = false,defaultValue = "5") int limit, String shUserID)
    {
        return userinfoService.selectAll(page,limit,shUserID);
    }
    @RequestMapping("/search")
    /**
     * 分条件查询
     * shUserId,商户
     *shRealName,负责人
     *shPhone,电话
     * 参数只能一个有值
     *RshUserId,
     */
    public Map<String,Object> search(@RequestParam(required = false,defaultValue = "1") int page, @RequestParam(required = false,defaultValue = "5") int limit,
                                     String shUserId,String shRealName,String shPhone,String RshUserId){
        return userinfoService.search(page,limit,shUserId,shRealName,shPhone,RshUserId);
    }
    @RequestMapping("/updateMerchant")
    /**
     * 根据商户id更改负责人
     * shUserID 商户id
     * shRealName 负责人
     * shPhone 负责人电话
     */
    public int updateMerchant(String shUserId,String shRealName,String shPhone){
        return userinfoService.updateMerchant(shUserId,shRealName,shPhone);
    }
    @RequestMapping("/updateDividend")
    /**
     * 添加或修改分红人
     * shUserId  商户
     * shUserIdA  分红A
     * shPaymentRatioA  A分红比例
     * shUserIdB 分红B
     * shPaymentRatioB  B分红比例
     */
    public int updateDividend(String shUserId,String shUserIdA,int shPaymentRatioA
            ,String shUserIdB,int shPaymentRatioB){
         return userinfoService.updateDividend(shUserId,shUserIdA,shPaymentRatioA,shUserIdB,shPaymentRatioB);
    }
    @RequestMapping("/examineUser")
    /**
     * 添加或修改分红人
     * shUserId  商户
     */
    public int examineUser(String shUserId){
         return userinfoService.examineUser(shUserId);
    }
    @RequestMapping("/addUser")
    /**
     * 添加或修改分红人
     * shUserId  商户
     */
    public int addUser(String shUserIdUp,String shUserId,String shRealName,String shPhone,int shPaymentRatio){
         return userinfoService.addUser(shUserIdUp,shUserId,shRealName,shPhone,shPaymentRatio);
    }
    @RequestMapping("/operatingLevel")
    /**
     * 添加或修改分红人
     * shUserId  商户
     */
    public  List<Map<String,Object>> operatingLevel(String shUserId){
        return userinfoService.operatingLevel(shUserId);
    }
}
