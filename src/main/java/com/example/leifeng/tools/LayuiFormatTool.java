package com.example.leifeng.tools;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leifeng
 * @description: layui表格数据格式化工具类
 * @author: lingbin
 * @create: 2020-05-30 17:36
 **/
@Component
public class LayuiFormatTool {
    public Map<String,Object> transformMap(int total,Object json){
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("code","0");
        userMap.put("msg","");
        userMap.put("count",total);
        userMap.put("data",json);
        return userMap;
    }
}
