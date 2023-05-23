package com.atguigu.spring6.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Resourcesi18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("zh", "CN"));
        ResourceBundle bundle2= ResourceBundle.getBundle("message", new Locale("en", "GB"));
        String test = bundle.getString("test");
        String test1 = bundle2.getString("test");
        System.out.println(test);
        System.out.println(test1);
    }
}
