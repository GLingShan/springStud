package com.atguigu.spring6.iocxml.auto.dao;

/**
 * ClassName:UserDaoImpl
 * Package:com.felix.spring6.iocxml.auto.dao
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 14:34
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao的方法执行了");
    }
}
