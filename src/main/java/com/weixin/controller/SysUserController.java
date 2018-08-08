/**
 * FileName: SysUserController
 * Author:   Carty.Li
 * Date:     2018/8/5 11:15
 * Description: 用户
 */
package com.weixin.controller;

import com.weixin.model.SysUser;
import com.weixin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈用户〉
 *
 * @author Administrator
 * @create 2018/8/5
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/select")
    public List<SysUser> selectAll(){
        return sysUserService.selectAll();
    }

    @PostMapping("/test")
    public String test(){
        return "success";
    }
}