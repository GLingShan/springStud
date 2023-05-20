// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.di_test;

/**
 * Dept
 */
public class Dept {

  private String dname;

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }



  public void info(){
    System.out.println("部门名称：" + this.dname);
  }
}
