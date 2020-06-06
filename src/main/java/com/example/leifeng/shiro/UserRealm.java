package com.example.leifeng.shiro;

import com.example.leifeng.models.Vipuserinfo;
import com.example.leifeng.service.VipUserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private VipUserInfoService vipUserInfoService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权！");
        SimpleAuthorizationInfo sai = new SimpleAuthorizationInfo();
        Vipuserinfo vipuserinfo = vipUserInfoService.selectById(((Vipuserinfo) SecurityUtils.getSubject().getPrincipal()).getId());
        sai.addStringPermission(vipuserinfo.getPerms());
        return sai;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证！");
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        //User user = VipUserInfoService.findByUsername(token.getUsername());
        Vipuserinfo vipuserinfo = vipUserInfoService.selectVipUserInfo(token.getUsername());
        if(vipuserinfo == null){
            return null;
        }
        return new SimpleAuthenticationInfo(vipuserinfo,vipuserinfo.getPassword(),"");
    }
}
