package com.zhang.springboot.controller;


import com.zhang.springboot.common.Result;
import com.zhang.springboot.entity.User;
import com.zhang.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaozhang
 * @since 2021-04-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.success(200, "操作成功", user);
    }

}
