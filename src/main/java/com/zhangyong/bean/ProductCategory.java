package com.zhangyong.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author 张勇
 * @Date 2020/2/19 11:31
 * @Version 1.0
 * 商品类别实体
 */
@Data
public class ProductCategory {

	private Long productCategoryId;
	private Long shopId;
	private String productCategoryName;
	private Integer priority;
	private Date createTime;
}
