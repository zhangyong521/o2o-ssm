package com.zhangyong.service;

import com.zhangyong.bean.Area;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-06-23 14:59
 * @PS:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AreaServiceTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
        Assert.assertEquals("西苑",areaList.get(0).getAreaName());
    }
}