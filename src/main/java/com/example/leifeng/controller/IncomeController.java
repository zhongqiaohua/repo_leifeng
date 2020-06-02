package com.example.leifeng.controller;

import com.example.leifeng.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: leifeng
 * @description: 商家提现
 * @author: lingbin
 * @create: 2020-05-29 16:38
 **/
@Controller
@ResponseBody
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    IncomeService incomeService;
    @RequestMapping("/selAllByShUserId")
    /**
     * 根据商户权限查询
     */
    public Map<String,Object> selAllByShUserId(@RequestParam(required = false,defaultValue = "1") int page, @RequestParam(required = false,defaultValue = "5") int limit
            , String shUserID){
        return incomeService.selAllByShUserId(page,limit,shUserID);
    }
    @RequestMapping("/search")
    /**
     *
     */
    public Map<String,Object> search(@RequestParam(required = false,defaultValue = "1") int page,
                                     @RequestParam(required = false,defaultValue = "5") int limit,
                                     String shUserId){
        return incomeService.search(page,limit,shUserId);
    }
}
