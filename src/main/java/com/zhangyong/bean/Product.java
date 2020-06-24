package com.zhangyong.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 商品实体
 */
@Data
public class Product implements Serializable{

	private Long productId;
	private String productName;
	private String productDesc;
	/**
	 * 简略图
	 */
	private String imgAddr;
	private String normalPrice;
	private String promotionPrice;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	/**
	 * -1.不可用 ,0.下架 1.在前端展示系统展示
	 */
	private Integer enableStatus;
	private List<ProductImg> productImgList;
	private ProductCategory productCategory;
	private Shop shop;


}
