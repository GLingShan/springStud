package com.atguigu.spring6.iocxml.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:Test
 * Package:com.felix.spring6.iocxml.scope
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 10:34
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println(orders1);
    }
}
