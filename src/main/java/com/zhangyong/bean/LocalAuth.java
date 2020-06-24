package com.zhangyong.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 管理员实体
 */
@Data
public class LocalAuth {

	private Long localAuthId;
	private String username;
	private String password;
	private Date createTime;
	private Date lastEditTime;
	private PersonInfo personInfo;

}
