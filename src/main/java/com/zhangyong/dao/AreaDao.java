package com.zhangyong.dao;

import com.zhangyong.bean.Area;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-06-23 14:26
 * @PS: 区域的DAO
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();
}
