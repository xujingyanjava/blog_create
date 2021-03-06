package com.yanblog.model.dao;

import com.yanblog.model.domain.SnsCategory;
import com.yanblog.model.domain.SnsCategoryExample;

import java.util.List;
import java.util.Map;


public interface SnsCategoryMapper {
    int countByExample(SnsCategoryExample example);

    int deleteByPrimaryKey(Long snsCategoryId);

    int insert(SnsCategory record);

    int insertSelective(SnsCategory record);

    List<SnsCategory> selectByExample(SnsCategoryExample example);

    SnsCategory selectByPrimaryKey(Long snsCategoryId);

    int updateByPrimaryKeySelective(SnsCategory record);

    int updateByPrimaryKey(SnsCategory record);

    int count(Map<String,Object> params);

    List<SnsCategory> selectAll(Map<String,Object> params);
}