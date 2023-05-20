// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * MyfactoryBean
 */
public class MyfactoryBean implements FactoryBean<User> {

  @Override
  public User getObject() throws Exception {
    System.out.println("初始化前先走无参构造");
    return new User();
  }

  @Override
  public Class<?> getObjectType() {
    return User.class;
  }
}
