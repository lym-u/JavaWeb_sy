package com.score.controller;

import com.score.bean.Canteen;
import com.score.bean.ResultObject;
import com.score.service.CanteenService;
import com.score.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 所有用户：
 *   查看食堂（getAllCanteen）
 *   查询食堂（serchCanteen）
 *   计算菜品评分（calcCanteenRate）
 *
 * 系统管理员：
 *   [编号、名称、位置、建立时间、管理员]
 *   添加食堂（addCanteen）
 *   删除食堂（deleteCanteen）
 *   修改食堂信息（updateCanteen）
 *   设置食堂管理员（setCanteen）
 *
 * 食堂管理员：
 *   [营业时间、简介]
 *   维护食堂信息（editCanteen）
 *
 * 师生用户：
 *
 */
@RequestMapping("/canteen")
@RestController //标识为返回类型为Json的控制器
public class CanteenController {
    //自动注入服务类
    @Autowired
    private CanteenService canteenService;

    //标识请求地址
    @RequestMapping("/getAllCanteen")
    public ResultObject<List<Canteen>> getAllCanteen(Canteen canteen, HttpServletRequest request) {
        ResultObject<List<Canteen>> rs=new ResultObject<List<Canteen>>();
        return rs;
    }
}
