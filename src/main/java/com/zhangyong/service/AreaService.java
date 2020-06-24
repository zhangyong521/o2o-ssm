package com.zhangyong.service;

import com.zhangyong.bean.Area;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-06-23 14:55
 * @PS:
 */
public interface AreaService {
    /**
     * 获取全部的区域
     * @return
     */
    List<Area> getAreaList();
}
