package com.canteen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 食堂管理员：
 *   查看收到的投诉信息（getRecComplaint）
 *   回复处理结果（replyComplaint）
 *
 * 师生用户：
 *   提交投诉信息（addComplaint）
 *   查看提交的投诉信息（getMyComplaint）
 *
 */
@RequestMapping("/complaint")
@RestController
public class ComplaintController {
}
