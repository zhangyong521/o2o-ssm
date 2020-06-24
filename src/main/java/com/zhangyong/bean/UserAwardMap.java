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
public class UserAwardMap {

	private Long userAwardId;
	private Long userId;
	private Long awardId;
	private Long shopId;
	private String userName;
	private String awardName;
	private Date expireTime;
	private Date createTime;
	private Integer usedStatus;
	private Integer point;
	private PersonInfo user;
	private Award award;
	private Shop shop;


}
