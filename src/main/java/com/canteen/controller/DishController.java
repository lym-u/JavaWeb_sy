package com.canteen.controller;

import com.canteen.bean.Dishes;
import com.canteen.bean.ResultObject;
import com.canteen.bean.TStudent;
import com.canteen.service.DishService;
import com.canteen.service.TStudentService;
import com.canteen.util.Constant;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 所有用户：
 *   查看菜品（getAllDishes）
 *   搜索菜品（serchDish）
 *   计算菜品评分（calcDishRate）
 *
 * 食堂管理员：
 *   [编号、菜名、价格、促销价格、菜系、所属食堂ID、菜品描述、图片路径]
 *   添加菜品（addDish）
 *   删除菜品（deleteDish）
 *   修改菜品信息（updateDish）
 *
 * 师生用户：
 *
 *
 */
@RequestMapping("/dish")
@RestController
public class DishController {
    @Autowired
    private DishService dishService;

    @RequestMapping("/getAllDishes")
    public ResultObject<List<Dishes>> getAllDishes(Dishes dishes, @RequestParam("limit") int limit, @RequestParam("page") int page) {
        System.out.println(dishes);
        PageInfo<Dishes> pageInfo=dishService.getAllDish(dishes, page, limit);
        ResultObject<List<Dishes>> rs=new ResultObject<List<Dishes>>();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(pageInfo.getList());
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

    @RequestMapping("/serchDish")
    public ResultObject<List<Dishes>> serchDish() {
        ResultObject<List<Dishes>> rs=new ResultObject<List<Dishes>>();
        List<Dishes> list=dishService.serchDish();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        int total=list.size();
        Long a=Long.parseLong(String.valueOf(total));
        rs.setCount(a);
        return rs;
    }

    @RequestMapping("/addDish")
    public ResultObject<Object> addDish(Dishes dish) {
        ResultObject<Object> rs = new ResultObject<>();

        Integer id = dishService.addDish(dish);

        if (id != null) {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("增加菜品信息成功");
        } else {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("增加菜品信息失败");
        }
        return rs;
    }

    @RequestMapping("/deleteDish")
    public ResultObject<Object> deleteDish(@RequestParam("dishID") int dishID) {
        Integer total=dishService.deleteDish(dishID);
        //统一返回
        ResultObject<Object> rs=new ResultObject<Object>();
        if(null==total||0==total) {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("删除菜品信息失败");
        }else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("删除菜品信息成功");
        }
        return rs;
    }

    @RequestMapping("/updateDish")
    public ResultObject<Object> updateDish(Dishes dish) {
        Integer total=dishService.updateDish(dish);
        //统一返回
        ResultObject<Object> rs=new ResultObject<Object>();
        if(null==total||0==total) {
            rs.setCode(Constant.FAILURE_RETUEN_CODE);
            rs.setMsg("修改菜品信息失败");
        }else {
            rs.setCode(Constant.SUCCESS_RETUEN_CODE);
            rs.setMsg("修改菜品信息成功");
        }
        return rs;
    }

}
