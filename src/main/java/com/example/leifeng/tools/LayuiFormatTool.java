package com.example.leifeng.tools;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public List<Map<String,Object>> operatingLevelToos(List<Map<String,Object>> mapList){
        List<Map<String,Object>> list = new ArrayList<>();
        if(mapList.size() <2)
            return mapList;
        for(int i = 0;i<mapList.size();i++){
            int level = (int)mapList.get(i).get("sh_level");
            switch (level){
                case 0:
                    Map<String,Object> map = new HashMap<>();
                    map.put("id",mapList.get(i).get("id"));
                    map.put("pid","");
                    map.put("name",mapList.get(i).get("name"));
                    list.add(i,map);
                    break;
                case 1:
                    Map<String,Object> map1 = new HashMap<>();
                    map1.put("id",mapList.get(i).get("id"));
                    map1.put("pid","2");//雷风商户ID为2
                    map1.put("name",mapList.get(i).get("name"));
                    list.add(i,map1);
                    break;
                case 2:
                    Map<String,Object> map2 = new HashMap<>();
                    for(int a = 0;a<list.size();a++)
                    {
                        if(mapList.get(i).get("1").equals(list.get(a).get("name")))
                        {
                            map2.put("pid",list.get(a).get("id"));
                            break;
                        }
                        else{
                            map2.put("pid","");
                        }
                    }
                    map2.put("id",mapList.get(i).get("id"));
                    map2.put("name",mapList.get(i).get("name"));
                    list.add(i,map2);
                    break;
                case 3:
                    Map<String,Object> map3 = new HashMap<>();
                    for(int a = 0;a<list.size();a++)
                    {
                        if(mapList.get(i).get("2").equals(list.get(a).get("name")))
                        {
                            map3.put("pid",list.get(a).get("id"));
                            break;
                        }
                        else{
                            map3.put("pid","");
                        }
                    }
                    map3.put("id",mapList.get(i).get("id"));
                    map3.put("name",mapList.get(i).get("name"));
                    list.add(i,map3);
                    break;
                case 4:
                    Map<String,Object> map4 = new HashMap<>();
                    for(int a = 0;a<list.size();a++)
                    {
                        if(mapList.get(i).get("3").equals(list.get(a).get("name")))
                        {
                            map4.put("pid",list.get(a).get("id"));
                            break;
                        }
                        else{
                            map4.put("pid","");
                        }
                    }
                    map4.put("id",mapList.get(i).get("id"));
                    map4.put("name",mapList.get(i).get("name"));
                    list.add(i,map4);
                    break;
            }
        }
        return list;
    }
}
