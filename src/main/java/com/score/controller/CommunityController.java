package com.score.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所有用户（系统管理员 + 师生用户）：
 *   查看留言（getMsg）
 *   搜索留言（serchMsg）
 *   查看某用户所有留言（getUserMsg）
 *   删除留言（deleteMsg）
 *   修改留言（editMsg）
 *
 * 系统管理员：
 *
 * 师生用户：
 *   发布留言（addMsg）
 *   点赞留言（likeMsg）
 *   回复留言（replyMsg）
 *
 */
@RequestMapping("/community")
@RestController
public class CommunityController {
}
