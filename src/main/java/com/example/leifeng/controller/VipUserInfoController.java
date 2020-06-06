package com.example.leifeng.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VipUserInfoController {

    /**
     * 测试是否可以使用thymeleaf模板
     * @param model
     * @return
     */
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        model.addAttribute("name","我是springboot整合shiro!");
        return "test";
    }


    @RequestMapping("/add")
    public String add(){
        return "/user/add";
    }


    @RequestMapping("/update")
    public String update(){
        return "/user/update";
    }


    /**
     *ShiroConfig配置拦截规则处使用，意为：若无权限访问则跳转登录页
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("/login")
    public String login(String userid, String password, Model model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userid,password);
        try {
            subject.login(token);
            //登陆成功，跳转首页
            return "redirect:/index";
            //return "redirect:/testThymeleaf";
        } catch (UnknownAccountException e) {
            //e.printStackTrace();
            model.addAttribute("msg","用户名不存在");
            return "login";
        }catch (IncorrectCredentialsException e) {
            //e.printStackTrace();
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }


    /**
     *登陆成功之后跳转首页
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    /**
     *ShiroConfig配置拦截规则处使用，意为：若无权限访问则跳转无权限页
     */
    @RequestMapping("/unAuthorized")
    public String unAuthorized(){
        return "unAuthorized";
    }


    /**
     *ShiroConfig配置拦截规则处使用，意为：若无权限访问则跳转无权限页
     */
    @RequestMapping("/priceInfo")
    public String priceInfo(){
        return "/priceInfo";
    }

}
