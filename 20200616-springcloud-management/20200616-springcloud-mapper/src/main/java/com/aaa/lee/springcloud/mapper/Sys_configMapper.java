package com.aaa.lee.springcloud.mapper;

import com.aaa.lee.springcloud.model.Sys_config;

import java.util.List;

public interface Sys_configMapper {
    int deleteByPrimaryKey(String variable);

    int insert(Sys_config record);

    Sys_config selectByPrimaryKey(String variable);

    List<Sys_config> selectAll();

    int updateByPrimaryKey(Sys_config record);
}