package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName:UserDaoImpl
 * Package:com.felix.spring6.autowired.dao
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/21 15:49
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao....");
    }
}
