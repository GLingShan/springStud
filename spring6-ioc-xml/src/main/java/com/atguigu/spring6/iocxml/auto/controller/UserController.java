package com.atguigu.spring6.iocxml.auto.controller;


import com.atguigu.spring6.iocxml.auto.service.UserService;
import com.atguigu.spring6.iocxml.auto.service.UserServiceImpl;

/**
 * ClassName:UserController
 * Package:com.felix.spring6.iocxml.auto
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 14:31
 * @Version 1.0
 */
public class UserController {
    private UserService userService;

//    public UserService getUserService() {
//        return userService;
//    }
//
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller方法执行了....");
        //调用service的方法
//        userService.addUserService();
//        UserService userService=new UserServiceImpl();
        userService.addUserService();
    }
}
