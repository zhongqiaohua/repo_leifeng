package com.example.leifeng.service;

import com.example.leifeng.dao.VipuserinfoMapper;
import com.example.leifeng.models.PriceinfoExample;
import com.example.leifeng.models.Vipuserinfo;
import com.example.leifeng.models.VipuserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class VipUserInfoService {

    @Autowired
    private VipuserinfoMapper vipuserinfoMapper;

    public Vipuserinfo selectVipUserInfo(String userid) {

        VipuserinfoExample example = new VipuserinfoExample();
        VipuserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);

        List<Vipuserinfo> vipuserinfoList = vipuserinfoMapper.selectByExample(example);

        if(vipuserinfoList.size() > 0) {
            return vipuserinfoMapper.selectByExample(example).get(0);
        }
        return null;
    }

    public Vipuserinfo selectById(Integer id) {
        return vipuserinfoMapper.selectByPrimaryKey(id);
    }
}
