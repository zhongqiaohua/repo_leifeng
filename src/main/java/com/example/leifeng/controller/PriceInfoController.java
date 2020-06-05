package com.example.leifeng.controller;

import com.example.leifeng.models.Priceinfo;
//import com.example.leifeng.service.PriceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@ResponseBody
@RequestMapping("/priceInfo")
public class PriceInfoController {

//    @Autowired
//    private PriceInfoService priceInfoService;
//
//    /**
//     * 页面展示所有网点信息
//     */
//    @RequestMapping("/selectAll")
//    public Map<String,Object> selectAll(@RequestParam(required = false,defaultValue = "1") int page,
//                                        @RequestParam(required = false,defaultValue = "20") int limit){
//        return priceInfoService.selectAll(page,limit);
//    }
//
//
//    /**
//     * 添加网点信息
//     */
//    @RequestMapping("/insert")
//    public int insert(@RequestBody Priceinfo priceinfo){
//        return priceInfoService.insertSelective(priceinfo);
//    }
//
//
//
//    /**
//     * 根据ID编辑网点信息
//     */
//    @RequestMapping("/updatePriceInfo")
//    public int updatePriceInfo(@RequestBody Priceinfo priceinfo){
//        return priceInfoService.updatePriceInfo(priceinfo);
//    }
//
//
//    /**
//     * 根据ID删除网点
//     */
//    @RequestMapping("/deleteById")
//    public int deleteById(Integer id){
//        return priceInfoService.deleteById(id);
//    }
}
