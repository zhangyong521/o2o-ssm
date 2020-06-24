package com.zhangyong.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 微信实体
 */
@Data
public class WechatAuth {

	private Long wechatAuthId;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;
}
