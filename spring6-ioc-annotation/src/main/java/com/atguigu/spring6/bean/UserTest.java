package com.atguigu.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6.bean
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 15:31
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
