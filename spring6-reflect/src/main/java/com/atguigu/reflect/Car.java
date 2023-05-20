// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.reflect;

/**
 * Car
 */
public class Car {

  private  String name;
  private int age;
  private String color;

  public Car() {
  }

  private void run(){
    System.out.println("私有方法-run");
  }

  public Car(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
