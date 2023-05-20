package com.atguigu.spring6.iocxml.dimap;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:StudentTest
 * Package:com.felix.spring6.iocxml.dimap
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/20 15:38
 * @Version 1.0
 */
public class StudentTest {
    @Test
    public void test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean-diref.xml");

        Student student = context.getBean("studentp",Student.class);
        student.run();
    }
}
