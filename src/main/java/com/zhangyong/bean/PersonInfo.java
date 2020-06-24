package com.zhangyong.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 用户信息实体
 */
@Data
public class PersonInfo {

	private Long userId;
	private String name;
	private String profileImg;
	private String email;
	private String gender;
	/**
	 * 用户状态
	 */
	private Integer enableStatus;
	/**
	 * 1.顾客 2.店家 3.超级管理员
	 */
	private Integer userType;
	private Date createTime;
	private Date lastEditTime;

}
