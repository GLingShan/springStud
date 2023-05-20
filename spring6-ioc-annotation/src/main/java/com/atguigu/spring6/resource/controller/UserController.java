package com.atguigu.spring6.resource.controller;


import com.atguigu.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * ClassName:UserController
 * Package:com.felix.spring6.autowired
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 15:47
 * @Version 1.0
 */
@Controller("myUserController")
public class UserController {

    //根据名称进行注入
//    @Resource(name = "myUserService")
//    private UserService userService;

    //根据类型配置
    @Resource
    private UserService userService;

    public void add() {
        System.out.println("controller........");
        userService.add();
    }
}
