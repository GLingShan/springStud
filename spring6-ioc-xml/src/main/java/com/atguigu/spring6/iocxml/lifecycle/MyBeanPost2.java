package com.atguigu.spring6.iocxml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName:MyBeanPost
 * Package:com.felix.spring6.iocxml.lifecycle
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 11:29
 * @Version 1.0
 */
public class MyBeanPost2 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3. 后置处理器 初始化之前执行");
        System.out.println(beanName+":"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5. 后置处理器 初始化之后执行");
        System.out.println(beanName+":"+bean);
        return bean;
    }
}
