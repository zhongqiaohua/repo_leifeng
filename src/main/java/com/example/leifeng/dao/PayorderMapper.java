package com.example.leifeng.dao;


import java.util.List;
import java.util.Map;

public interface PayorderMapper {
    List<Map<String,Object>> selectAll(int page,int limit,String shUserId);
    int countAll(String shUserId);
}