package com.atguigu.spring6.iocxml.auto;


import com.atguigu.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6.iocxml.auto
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 14:49
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
