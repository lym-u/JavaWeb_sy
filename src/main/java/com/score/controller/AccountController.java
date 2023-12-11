package com.score.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所有用户：
 *   登录（login）
 *   修改密码（editPwd）
 *
 * 系统管理员：
 *   [编号、名称、性别、密码]
 *   添加食堂管理员（addManager）
 *   删除食堂管理员（deleteManager）
 *   修改食堂管理员信息（updateManager）
 *
 * 食堂管理员：
 *
 *
 * 师生用户：
 *   注册（register）
 *
 */
@RequestMapping("/account")
@RestController //标识为返回类型为Json的控制器
public class AccountController {
}
