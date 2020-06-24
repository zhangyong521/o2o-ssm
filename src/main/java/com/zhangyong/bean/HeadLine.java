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
public class HeadLine {

	private Long lineId;
	private String lineName;
	/**
	 * 连接
	 */
	private String lineLink;
	private String lineImg;
	/**
	 * 权重
	 */
	private String priority;
	/**
	 * 0.不可用 1.可用
	 */
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;


}
