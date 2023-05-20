// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * MyBeanPost
 */
public class MyBeanPost implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("3.后置处理器，初始化前执行");
    return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
  }


  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("4.后置处理器，初始化后执行");
    return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
  }
}
