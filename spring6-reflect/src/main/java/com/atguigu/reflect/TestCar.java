// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.reflect;

import java.lang.reflect.Constructor;
import org.junit.Test;

/**
 * TestCar
 */
public class TestCar {

  @Test
  public void test01() throws Exception {
    Class clazz = Class.forName("com.atguigu.reflect.Car");
    Car car = (Car)clazz.getDeclaredConstructor().newInstance();
    System.out.println(car);

    //获得publicgou构造方法
    Constructor[] constructors = clazz.getConstructors();
    for (Constructor c : constructors) {
      System.out.println(c.getName()+"+"+c.getParameters());
    }

    //获得所有构造方法
    Constructor[] constructors1 = clazz.getDeclaredConstructors();
    for (Constructor c : constructors1) {
      System.out.println(c.getName()+"+"+c.getParameters());
    }
  }
}
