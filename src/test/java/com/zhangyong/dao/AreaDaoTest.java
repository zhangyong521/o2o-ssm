package com.zhangyong.dao;

import com.zhangyong.bean.Area;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-06-23 14:45
 * @PS: 推荐使用spring的单元测试，可以自动生成组件
 * 1、导入springTest模块
 * 2、@ContextConfiguration指定spring配置文件的位置
 * 3、直接@Autowired要使用的组件进行注入
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areas = areaDao.queryArea();
        Assert.assertEquals(2,areas.size());
    }
}