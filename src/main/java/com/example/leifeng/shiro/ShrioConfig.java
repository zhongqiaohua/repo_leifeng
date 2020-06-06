package com.example.leifeng.shiro;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShrioConfig {

    /**
     * 创建ShiroFilterFactoryBean
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean sffb = new ShiroFilterFactoryBean();
        sffb.setSecurityManager(securityManager);
        Map<String,String> filterMap = new LinkedHashMap<String, String>();

        filterMap.put("/testThymeleaf","anon");
        filterMap.put("/login","anon");
        filterMap.put("/add","authc");
        filterMap.put("/update","authc");
        //认证localhost:8080/lf,若没登录，跳转至登录页
        filterMap.put("/","authc");

        filterMap.put("/add","perms[user:add]");
        filterMap.put("/update","perms[user:update]");
        //filterMap.put("/priceInfo.html","perms[user:update]");

        sffb.setLoginUrl("/toLogin");
        sffb.setUnauthorizedUrl("/unAuthorized");

        sffb.setFilterChainDefinitionMap(filterMap);
        return sffb;
    }

    /**
     * 创建DefaultWebSecurityManager
     */
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
        dwsm.setRealm(userRealm);
        return dwsm;
    }

    /**
     * 创建Realm
     */
    @Bean(name="userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

    /**
     * 配置thymeleaf与shiro标签配合使用
     */
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }
}
