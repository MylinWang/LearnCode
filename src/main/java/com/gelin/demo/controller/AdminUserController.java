package com.gelin.demo.controller;

import com.gelin.demo.Exception.ApiResponseError;
import com.gelin.demo.common.ApiResponse;
import com.gelin.demo.model.pojo.User;
import com.gelin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminUserController {

    @Autowired
    UserService userService;

    // 修改权限
    @PostMapping("/admin/role")
    public ApiResponse role(@RequestParam("role") Integer role, HttpSession session) {
        User user = (User) session.getAttribute("TEST");
        if (user == null) {
            return ApiResponse.error(ApiResponseError.USER_NEED_LOGIN);
        }
        userService.updateRole(user.getId(), role);
        return ApiResponse.success();
    }



}
