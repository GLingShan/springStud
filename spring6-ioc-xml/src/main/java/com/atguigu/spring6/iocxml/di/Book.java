// Copyright(C) 2023 NEC Corporation. All rights Reserved.

package com.atguigu.spring6.iocxml.di;

/**
 * Book
 */
public class Book {

  private String bname;
  private String author;
  private String others;

  public Book(String bname, String author, String others) {
    this.bname = bname;
    this.author = author;
    this.others = others;
  }

  public String getOthers() {
    return others;
  }

  public void setOthers(String others) {
    this.others = others;
  }

  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Book() {
  }

}
