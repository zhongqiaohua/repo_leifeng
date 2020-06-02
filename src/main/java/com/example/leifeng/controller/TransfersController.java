package com.example.leifeng.controller;

import com.example.leifeng.service.TransfersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: leifeng
 * @description: 商家提现详情表
 * @author: lingbin
 * @create: 2020-05-30 11:44
 **/
@Controller
@ResponseBody
@RequestMapping("/Transfers")
public class TransfersController {
    @Autowired
    TransfersService transfersService;
    @RequestMapping("/selALL")
    /**
     *
     */
    public Map<String,Object> selALL(@RequestParam(required = false,defaultValue = "1") int page,
                                     @RequestParam(required = false,defaultValue = "5") int limit, String shUserID){
        return transfersService.selALL(page,limit,shUserID);
    }
    @RequestMapping("/search")
    /**
     *
     */
    public Map<String,Object> search(@RequestParam(required = false,defaultValue = "1") int page,
                                     @RequestParam(required = false,defaultValue = "5") int limit,
                                     String shUserId){
        return transfersService.search(page,limit,shUserId);
    }
}
