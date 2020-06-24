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
public class Award {
	private Long awardId;
	private String awardName;
	private String awardDesc;
	private String awardImg;
	private Integer point;
	private Integer priority;
	private Date createTime;
	private Date expireTime;
	private Date lastEditTime;
	private Integer enableStatus;
	private Long shopId;


}
