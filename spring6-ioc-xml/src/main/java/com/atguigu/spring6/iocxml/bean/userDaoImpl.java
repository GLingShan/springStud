// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.bean;

/**
 * userDaoImpl
 */
public class userDaoImpl implements userDao{
  @Override
  public void run() {
    System.out.println("userdaoImpl");
  }
}
