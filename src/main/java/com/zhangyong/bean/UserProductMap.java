package com.zhangyong.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 实体
 */
@Data
public class UserProductMap {
	private Long userProductId;
	private Long userId;
	private Long productId;
	private Long shopId;
	private String userName;
	private String productName;
	private Date createTime;
	private Integer point;
	private PersonInfo user;
	private Product product;
	private Shop shop;


}
