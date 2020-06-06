package com.example.leifeng.service;

import com.alibaba.fastjson.JSONObject;
import com.example.leifeng.dao.PriceinfoMapper;
import com.example.leifeng.models.Priceinfo;
import com.example.leifeng.models.PriceinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.Map;


@Transactional
@Service
public class PriceInfoService {

    @Autowired
    private PriceinfoMapper priceInfoMapper;


    public int insertSelective(Priceinfo priceinfo) {
        return priceInfoMapper.insertSelective(priceinfo);
    }


    public int deleteById(Integer id) {
        PriceinfoExample example = new PriceinfoExample();
        PriceinfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return priceInfoMapper.deleteByExample(example);
    }

    public int updatePriceInfo(Priceinfo priceinfo) {
        PriceinfoExample example = new PriceinfoExample();
        PriceinfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(priceinfo.getId());
        return priceInfoMapper.updateByExampleSelective(priceinfo, example);
    }


    public Map<String,Object> selectAll(int page, int limit){
        Map<String,Object> deviceMap = new LinkedHashMap<>();
        int total = priceInfoMapper.countByExample(null);
        deviceMap.put("code","0");
        deviceMap.put("msg","");
        deviceMap.put("count",total);
        Object json = JSONObject.toJSON(priceInfoMapper.selectAll(page-1,limit));
        deviceMap.put("data",json);
        return deviceMap;
    }

}
