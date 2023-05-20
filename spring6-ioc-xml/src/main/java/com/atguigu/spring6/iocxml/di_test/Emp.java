// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.di_test;

/**
 * Emp
 */
public class Emp {

  private Dept dept;

  private String ename;

  private int age;

  public Dept getDept() {
    return dept;
  }

  public void setDept(Dept dept) {
    this.dept = dept;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void work(){
    System.out.println(ename +"have worked for" + age);
    dept.info();
  }
}
