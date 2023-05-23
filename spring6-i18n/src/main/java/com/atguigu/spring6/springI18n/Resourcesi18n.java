package com.atguigu.spring6.springI18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Resourcesi18n {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"gaojian",new Date().toString()};
        String message = applicationContext.getMessage("www.atguigu.com", objs, Locale.UK);
        System.out.println(message);
    }
}
