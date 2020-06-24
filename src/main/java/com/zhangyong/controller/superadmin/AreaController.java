package com.zhangyong.controller.superadmin;

import com.zhangyong.bean.Area;
import com.zhangyong.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 张勇
 * @Blog: https://blog.csdn.net/zy13765287861
 * @Version: 1.0
 * @Date: 2020-06-23 15:13
 * @PS:
 */
@Controller
@RequestMapping("/superadmin")
@Slf4j
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> listArea() {
        log.info("=================start=============");
        long startTime = System.currentTimeMillis();
        /**
         * 存放方法的返回值
         */
        Map<String, Object> map = new HashMap<>();
        /**
         * 获取service的区域列表
         */
        List<Area> list = new ArrayList<>();
        try {
            list = areaService.getAreaList();
            map.put("rows", list);
            map.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            //返回错误状态
            map.put("success", false);
            map.put("errMsg", toString());
        }
        log.error("test error");
        long endTime = System.currentTimeMillis();
        log.debug("costTime:[{}ms]",endTime-startTime);
        log.info("==============end==============");
        return map;
    }
}
