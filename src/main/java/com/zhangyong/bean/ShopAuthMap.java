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
public class ShopAuthMap {

	private Long shopAuthId;
	private Long employeeId;
	private Long shopId;
	private String name;
	private String title;
	private Integer titleFlag;
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;
	private PersonInfo employee;
	private Shop shop;

}
