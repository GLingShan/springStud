package com.atguigu.spring6.autowired;

import com.atguigu.spring6.autowired.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6.autowired
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 16:04
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        UserController controller = context.getBean(UserController.class);
        controller.add();
    }
}
