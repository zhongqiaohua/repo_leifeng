package com.example.leifeng.controller;

import com.example.leifeng.service.DeviceinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @program: leifeng
 * @description: 设备控制层
 * @author: lingbin
 * @create: 2020-05-12 15:14
 **/
@Controller
@ResponseBody
@RequestMapping("/Deviceinfo")
public class DeviceinfoController {
    @Autowired
    DeviceinfoService deviceinfoService;
    @RequestMapping("/selectAll")
    /**
     *
     */
    public Map<String,Object> selectAll(@RequestParam(required = false,defaultValue = "1") int page, @RequestParam(required = false,defaultValue = "5") int limit,String shUserID){
        return deviceinfoService.selectAll(page,limit,shUserID);
    }
    @RequestMapping("/search")
    /**
     * deviceId 设备编号
     * controlId 4G模块编号
     * deviceDetailAddress 设备详细地址
     * userId 充电用户
     * 参数只能一个有值
     */
    public Map<String,Object> search(@RequestParam(required = false,defaultValue = "1") int page, @RequestParam(required = false,defaultValue = "5") int limit,
                                     String deviceId,String controlId,String deviceDetailAddress,String userId,String RshUserId){
        return deviceinfoService.search(page,limit,deviceId,controlId,deviceDetailAddress,userId,RshUserId);
    }

    @RequestMapping("/multiconditionalSearch")
    /**
     * shUserId 商户
     * network 网点
     * online 在线状态
     * chargetype 充电状态
     *
     */
    public Map<String,Object> multiconditionalSearch(int page,int limit,String shUserId,String network,String online,String chargetype,String RshUserId){
        return deviceinfoService.multiconditionalSearch(page,limit,shUserId,network,online,chargetype,RshUserId);
    }
    @RequestMapping("/linkageShUserId")
    /**
     * 根据商户获取其下属商户
     * String shUserId 商户
     */
    public List<String> linkageShUserId(String shUserId){
        return deviceinfoService.linkageShUserId(shUserId);
    }
    @RequestMapping("/linkageNetwork")
    /**
     * 根据商户获取其下属商户
     * String shUserId 商户
     */
    public List<String> linkageNetwork(String shUserId){
        return deviceinfoService.linkageNetwork(shUserId);
    }
    @RequestMapping("/unbindByDeviceid")
    /**
     * 将设备解绑
     * String deviceid 设备编号
     */
    public int unbindByDeviceid(String deviceid){
         return deviceinfoService.unbindByDeviceid(deviceid);
    }
    @RequestMapping("/updateShUserId")
    /**
     * 设备更改商家网点
     * deviceId 设备编号
     * shUserId 需要绑定的商户
     * network 需要绑定的网点
     */
    public int updateShUserId(String deviceId,String shUserId,String network)
    {
        return deviceinfoService.unbindByDeviceid(deviceId,shUserId,network);
    }
    @RequestMapping("/deviceinfoMultiEdit")
    /**
     * 设备批量解绑或批量更改
     * deviceId []  要解绑的设备数组
     * shUserId 需要更改的商户
     * network 需要更改的网点
     */
    public int deviceinfoMultiEdit(Integer[] deviceId,String shUserId,String network){
        return deviceinfoService.deviceinfoMultiEdit(deviceId,shUserId,network);
    }
}
