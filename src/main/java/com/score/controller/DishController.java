package com.score.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所有用户：
 *   查看菜品（getDish）
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
}
