package com.aaa.lee.springcloud.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
@Accessors(chain = true)
public class Sys_config {
    private String variable;

    private String value;

    private Date setTime;

    private String setBy;


}