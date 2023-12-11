package com.score.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所有用户：
 *   查看食堂评价（getCanteenCmt）
 *   查看菜品评价（getDishCmt）
 *
 * 系统管理员：
 *   删除食堂评价（deleteCanteenCmt）
 *   删除菜品评价（deleteDishCmt）
 *
 * 食堂管理员：
 *   回复食堂评价（replyCanteenCmt）
 *   回复菜品评价（replyDishCmt）
 *
 * 师生用户：
 *   评价食堂（addCanteenCmt）
 *   评价菜品（addDishCmt）
 *   删除食堂评价（deleteCanteenCmt）
 *   删除菜品评价（deleteDishCmt）
 *
 */
@RequestMapping("/comment")
@RestController
public class CommentController {
}
