package com.zhangyong.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 店铺实体
 */
@Data
public class Shop {

    private Long shopId;
    private Long ownerId;
    /**
     * 店铺分类Id
     */
    private Long shopCategoryId;
    private String shopName;
    /**
     * 店铺描述
     */
    private String shopDesc;
    /**
     * 店铺具体地址
     */
    private String shopAddr;
    private String phone;
    private String shopImg;
    private Double longitude;
    private Double latitude;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    /**
     * -1.不可用 0.审核中 1.可用
     */
    private Integer enableStatus;
    /**
     * 超级管理员给店家的提醒
     */
    private String advice;

    /**
     * 区域实体类：表示店铺属于哪一块区域
     */
    private Area area;
    /**
     * 店铺类别实体类
     */
    private ShopCategory shopCategory;

    /**
     * 用户信息实体类：表示店铺由谁创建
     */
    private PersonInfo owner;



}
