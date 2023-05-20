package com.atguigu.spring6.iocxml.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:UserTest
 * Package:com.felix.spring6.iocxml.lifecycle
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 10:51
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 bean对象创建完成,可以完成了");
        System.out.println(user);
        context.close();
    }
}
